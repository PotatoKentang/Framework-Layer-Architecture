package iterator;

import java.util.ArrayList;

public class Iterator {
	ArrayList<String> data;
	int i;
	public Iterator(ArrayList<String> data) {
		this.data = data;
	}
	public boolean hasNext() {
		if(i<data.size()) {
			return true;			
		}
		return false;
	}
	public String getNext() {
		return data.get(i++);
	}
}
