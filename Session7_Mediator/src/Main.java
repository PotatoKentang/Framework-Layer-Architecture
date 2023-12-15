import mediator.Mediator;
import model.Host;

public class Main {

	public Main() 
	{
		//mediator mengatur hubungan antar class
		//mediator ditengah sebagai jembatan
		//mediator menyimpan host, memiliki method,
		//sisa class menyimpan reference ke mediator
		//apa bedanya ini dan observer pattern
		//menyimpan semua object yang berelasi
		
		Mediator mediator = new Mediator(); 
		Host a = new Host("google","192.168.1.1", mediator);
		Host b = new Host("facebook","192.168.1.2",mediator);
		Host c = new Host("linkedin","192.168.1.3",mediator);
		
		//google harus nyimpen host facebook dan juga linkedin
		//karena many to many relation harus di gambarkan di koneksi
		mediator.add(a);
		mediator.add(b);
		mediator.add(c);
		a.send("192.168.1.2");
	}
	public static void main(String[] args) {		
		new Main();
	}

}
