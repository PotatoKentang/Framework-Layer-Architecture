package proxy;

import database.Database;
import database.IExecutable;
import model.User;

public class Proxy implements IExecutable{
	static Database db;
	User user;
	public Proxy(User user) {
		super();
		this.user = user;
	}

	//security?
	//Adapter dimasukin tp ini merepresentasikan Class tsb
	//reference attribute ke class concrete
	//Protection Proxy
	@Override
	public void executeQuery(String query) {
		// TODO Auto-generated method stub
		if(db==null) {
			db = new Database(this.user);
		}
		if(this.user.role=="admin") {
			db.executeQuery(query);
		}
		else if (query.toLowerCase().contains("delete"))
		{
			System.out.println("User does not have permission to delete a db");
		}
		else {
			//untuk user -> semua query tapi bukan delete
			db.executeQuery(query);
		}
	}

}
