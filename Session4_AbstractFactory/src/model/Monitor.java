package model;

public abstract class Monitor {
	int refreshRate;
	int resolution;
	public Monitor(int refreshRate,int resolution) {this.refreshRate=refreshRate;this.resolution=resolution;}
	public abstract void assemble();
}

