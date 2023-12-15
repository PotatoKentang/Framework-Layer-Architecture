package Menu;

import java.util.ArrayList;
import java.util.Scanner;

import factory.AsusFactory;
import factory.MsiFactory;
import factory.ProductFactory;
import model.Gpu;
import model.Monitor;

public class Gameloop {
	Scanner sc = new Scanner(System.in);
	ArrayList<Gpu> gpus = new ArrayList<>();
	ArrayList<Monitor> monitors = new ArrayList<>();
	public void addGpu() {
		String factoryType="";
		String name="";
		int vRam=-1;
		do {
			System.out.println("Input Brand [Asus]|[Msi]");
			factoryType=sc.nextLine();
		} while(!factoryType.equals("Asus")&&!factoryType.equals("Msi"));
		
		do {
			System.out.println("Input your name");
			name = sc.nextLine();
		}while(name=="");
		
		do {
			System.out.println("How big is ur ram?");
			vRam = sc.nextInt();
			sc.nextLine();
		}while(vRam==-1);
		
		ProductFactory factory = null;
		if(factoryType.equals("Asus")) {
			factory = new AsusFactory();
		}
		else if(factoryType.equals("Msi")) {
			factory = new MsiFactory();
		}
		Gpu newGpu = factory.createGPU(name, vRam);
		gpus.add(newGpu);
	}
	public void addMonitor() {
		String factoryType="";
		int refreshRate=-1;
		int resolution=-1;
		do {
			System.out.println("Input Brand [Asus]|[Msi]");
			factoryType=sc.nextLine();
		} while(!factoryType.equals("Asus")&&!factoryType.equals("Msi"));
		
		do {
			System.out.println("Input your refreshRate");
			refreshRate = sc.nextInt();
		}while(refreshRate==-1);
		
		do {
			System.out.println("Input your refreshRate");
			resolution = sc.nextInt();
			sc.nextLine();
		}while(resolution==-1);
		
		ProductFactory factory = null;
		if(factoryType.equals("Asus")) {
			factory = new AsusFactory();
		}
		else if(factoryType.equals("Msi")) {
			factory = new MsiFactory();
		}
		Monitor newMonitor = factory.createMonitor(refreshRate, resolution);
		monitors.add(newMonitor);
	}
	public void viewItems() {
		System.out.println("View Items");
		System.out.println("List of Gpu");
		if(gpus.size()==0)
		{
			System.out.println("KOSONG TOLOL");
		}
		else {
			for(Gpu g:gpus) {
				System.out.println("hai kamu nemu gpu");
			}			
		}
		if(monitors.size()==0)
		{
			System.out.println("KOSONG TOLOL");
		}
		else {
			System.out.println("List of Monitors");
			for(Monitor m:monitors) {
				System.out.println("hai kamu nemu monitor");
			}			
		}
	}
	
	public void start() {
		while(true) {
			System.out.println("BinusComputerShop");
			System.out.println("1. Add GPU");
			System.out.println("2. Add Monitor");
			System.out.println("3. View Items");
			System.out.println("4. Exit");
			int choice = sc.nextInt();
			sc.nextLine();
			switch(choice) {
				case 1:
					addGpu();
					break;
				case 2:
					addMonitor();
					break;
				case 3:
					viewItems();
					break;
				default:
					System.exit(1);
					break;
			}
		}
	}
}
