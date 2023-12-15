import java.util.ArrayList;

import client.Client;
import client.Singleton;
import server.Server;

public class Main {

	public static void main(String[] args) {
		Client c1 = new Client("Jonh",12);
		Client c2 = new Client("Jonh",12);
		ArrayList<String> data = new ArrayList<String>();
		data.add("hello");
		data.add("hi");

		Singleton.getInstance().setAllData(data);
		Singleton.getInstance().addData("THOLOL");
		c1.start();
		c2.start();
		try {
			
			c1.showFetcherData();
			c2.showFetcherData();			
		}catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
