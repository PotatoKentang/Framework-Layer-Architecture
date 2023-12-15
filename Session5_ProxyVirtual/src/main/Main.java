package main;

import image.IDisplayable;
import image.ImageDisplay;
import proxy.Proxy;

public class Main {

	public Main() {
		IDisplayable img1 = new ImageDisplay("dog.jpg");
		IDisplayable img2 = new ImageDisplay("cat.jpg");
		IDisplayable img3 = new ImageDisplay("frog.jpg");
		
		img1.display();
		img2.display();
		img3.display();
		
		IDisplayable lazyimg1 = new Proxy("dog.jpg");
		IDisplayable lazyimg2 = new Proxy("cat.jpg");
		IDisplayable lazyimg3 = new Proxy("frog.jpg");
		lazyimg1.display();
		lazyimg2.display();
		lazyimg3.display();
		
	}

	public static void main(String[] args) {
		new Main();
	}
}
