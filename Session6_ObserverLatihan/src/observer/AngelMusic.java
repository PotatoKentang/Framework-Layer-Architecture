package observer;

import java.util.ArrayList;

public class AngelMusic {
	public String name;
	public AngelMusic(String name) {
		super();
		this.name = name;
	}
	ArrayList<Company> listener = new ArrayList<>();
	public void addListener(Company company) {
		this.listener.add(company);
	}
	public void addTrack(String trackName) {
		for (Company c : listener) {
			c.playTrack(trackName);
		}
	}
}
