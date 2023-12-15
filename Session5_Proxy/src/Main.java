import database.Database;
import model.User;
import proxy.Proxy;

public class Main {

	public Main() 
	{
		//Proxy Buat ngehandle request bersamaan yang repetitif jadi digunakan middle man buat ngecache
		//Menjaga keaman dengan validasi
		User user1= new User("admin");
		User user2= new User("user");
		
		//jalan tp gk aman
		Database db = new Database(user1);
		db.deleteAllData();
		
		
		//Proxy
		Proxy dbProxy = new Proxy(user1);
		dbProxy.executeQuery("hi");
		
		dbProxy = new Proxy(user2);
		dbProxy.executeQuery("hi");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
