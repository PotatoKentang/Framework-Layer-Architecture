package observer;

public class Company {
	String companyName;
	String companyType;
	public Company(String companyName, String companyType) {
		super();
		this.companyName = companyName;
		this.companyType = companyType;
	}
	public void playTrack(String trackName) {
		if(companyType.equals("Radio")) {
			System.out.println(this.companyName+" is now playing " + trackName);
		}
		else {
			System.out.println(this.companyName+" is currently playing " + trackName);
		}
	}
}
