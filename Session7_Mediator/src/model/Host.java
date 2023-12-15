package model;

import mediator.Mediator;

public class Host {
	String hostName;
	String ip;
	Mediator mediator;
	public String getHostName() {
		return hostName;
	}
	
	public void setHostName(String hostName) {
		this.hostName = hostName;
	}
	
	public String getIp() {
		return ip;
	}
	
	public void setIp(String ip) {
		this.ip = ip;
	}
	
	public Host(String hostName, String ip,Mediator mediator) {
		this.hostName = hostName;
		this.ip = ip;
		this.mediator = mediator;
	}

	public void send(String receiverIP) {
		System.out.println("Send Message to: "+receiverIP);
		mediator.send(receiverIP);
	}
	
	public void receive(String senderIp) {
		System.out.println(hostName+" received Message");
	}
}
