package factory;

import model.AOCMonitor;
import model.AsusMonitor;
import model.GTX1050;
import model.Gpu;
import model.Monitor;
import model.MsiMonitor;
import model.RTX3090;

public class MsiFactory extends ProductFactory{
	@Override
	Gpu createGPU(String name, int vram) {
		// TODO Auto-generated method stub
		Gpu rtx = (Gpu)new GTX1050(name, vram);
		rtx.assemble();
		return rtx;
	}

	@Override
	Monitor createMonitor(int refreshRate, int resolution) {
		// TODO Auto-generated method stub
		Monitor asusMonitor = (Monitor)new AOCMonitor(refreshRate, resolution);
		asusMonitor.assemble();
		return asusMonitor;
	}
	
}
