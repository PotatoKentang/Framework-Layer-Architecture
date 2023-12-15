package mediator;

import java.util.ArrayList;
import java.util.HashMap;

import model.Host;

public class Mediator {
	static HashMap<String, Host> hosts = new HashMap<>();
	
	public void send(String ip) {
		Host receiver = hosts.get(ip);
		System.out.println(ip);
		if(receiver == null) {
			System.out.println("Invalid IP");
			return;
		}
		receiver.receive(ip);
	}
	
	public void add(Host host) {
		hosts.put(host.getIp(), host);
	}
	
}
