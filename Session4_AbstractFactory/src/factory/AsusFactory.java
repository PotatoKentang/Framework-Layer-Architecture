package factory;

import model.AsusMonitor;
import model.Gpu;
import model.Monitor;
import model.MsiMonitor;
import model.RTX3090;

public class AsusFactory extends ProductFactory{
	@Override
	public
	Gpu createGPU(String name, int vram) {
		// TODO Auto-generated method stub
		Gpu rtx = (Gpu)new RTX3090(name, vram);
		rtx.assemble();
		return rtx;
	}

	@Override
	public
	Monitor createMonitor(int refreshRate, int resolution) {
		// TODO Auto-generated method stub
		Monitor asusMonitor = (Monitor)new AsusMonitor(refreshRate, resolution);
		asusMonitor.assemble();
		return asusMonitor;
	}
	
}
