package client;

import server.Server;

public class Singleton {
	static volatile Server s;
	public synchronized static Server getInstance() {
		return s==null?new Server():s;
	}
}
