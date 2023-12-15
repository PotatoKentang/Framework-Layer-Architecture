package model;

public abstract class Gpu {
	String name;
	int vram;
	public Gpu(String name,int vram) {this.name=name;this.vram=vram;}
	public abstract void assemble();
}

