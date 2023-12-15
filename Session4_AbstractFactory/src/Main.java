import Menu.Gameloop;
import factory.AsusFactory;
import model.AOCMonitor;
import model.AsusMonitor;
import model.Gpu;
import model.Monitor;

public class Main {

	public static void main(String[] args) {
		//note di aslab dia ngereturn concrete class bukan di typecast ke parent kek gw
		//misal AsusMonitor maka di return AsusMonitor bukan Monitor
		AsusFactory asusTufFactory = new AsusFactory();
		Monitor monitor = asusTufFactory.createMonitor(22,121);
		Gpu gpu = asusTufFactory.createGPU("RTX", 8);
		
		Gameloop gl = new Gameloop();
		gl.start();
		
	}
}
