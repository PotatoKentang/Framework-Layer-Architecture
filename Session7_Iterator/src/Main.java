import java.util.ArrayList;

import iterator.Iterator;

public class Main {

	public Main() 
	{
		ArrayList<String> data = new ArrayList<>();
		data.add("hello");
		data.add("hai");
		data.add("hapa kabs");
		data.add("heyho");
		Iterator iterator = new Iterator(data);
		while(iterator.hasNext()) {
			String currentData = iterator.getNext();
			System.out.println(currentData);
		}
		
	}
	public static void main(String[] args) {		
		new Main();
	}

}
