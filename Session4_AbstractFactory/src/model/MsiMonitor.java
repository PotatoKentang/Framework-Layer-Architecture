package model;

public class MsiMonitor extends Monitor{

	public MsiMonitor(int refreshRate, int resolution) {
		super(refreshRate, resolution);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void assemble() {
		System.out.printf("Assembling Monitor",super.refreshRate,super.resolution);
	}

}
