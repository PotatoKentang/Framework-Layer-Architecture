package client;

import server.Server;

public class Client extends Thread{
	String name;
	Server server;
	int age;
	public Client(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public void start()
	{
		this.server = Singleton.getInstance();
	}
	public void showFetcherData() {
		server.printData();
		System.out.println("                              ");
		System.out.println("                              ");
	}
	
}
