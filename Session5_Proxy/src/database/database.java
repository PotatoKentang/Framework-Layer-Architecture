package database;

import model.User;

public class Database implements IExecutable{
	static Database conn;
	User user;
	public Database(User user) {
		super();
		this.user = user;
	}
	@Override
	public void executeQuery(String query) {
		// TODO Auto-generated method stub
		System.out.println("Executing a query");
	}
	
	public void deleteAllData() {
	    System.out.println("Delete data");
		
	}
	
}
