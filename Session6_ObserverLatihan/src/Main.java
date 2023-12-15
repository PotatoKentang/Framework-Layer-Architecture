import java.util.Scanner;

import observer.AngelMusic;
import observer.Company;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AngelMusic am = new AngelMusic("Angel Music");
		Company c1 = new Company("PT Gogo Company","Radio");
		Company c2 = new Company("PT Loga Company","Hotel");
		Company c3 = new Company("PT Lola Company","Radio");
		am.addListener(c1);
		am.addListener(c2);
		am.addListener(c3);
		while(true) {
			System.out.println(am.name);
			Scanner s = new Scanner(System.in);
			String track = s.nextLine();
			am.addTrack(track);
		}
	}

}
