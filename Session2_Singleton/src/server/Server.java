package server;

import java.util.ArrayList;

public class Server {
	public static ArrayList<String> data = new ArrayList<String>();
	public ArrayList<String> getData() {
		return data;
	}
	public void setAllData(ArrayList<String> data) {
		this.data = data;
	}
	public void addData(String s) {
		this.data.add(s);
	}
	public void printData() {
		for(String s:this.data) {
			System.out.println(s);
		}
	}
}
