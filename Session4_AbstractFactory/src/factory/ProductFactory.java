package factory;

import model.Gpu;
import model.Monitor;

public abstract class ProductFactory {
	public abstract Gpu createGPU(String name,int vram);
	public abstract Monitor createMonitor(int refreshRate, int resolution);
}
