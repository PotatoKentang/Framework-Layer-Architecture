package proxy;

import image.IDisplayable;
import image.ImageDisplay;

public class Proxy implements IDisplayable{
	String image;
	ImageDisplay imageDisplay = null;
	
	public Proxy(String image) {
		this.image = image;
	}
	
	
	//lazy initialization, ketrigger hanya saat ada yang ngeload
	@Override
	public void display() {
		// TODO Auto-generated method stub
		if (imageDisplay==null) {
			imageDisplay = new ImageDisplay(this.image);			
		}
		imageDisplay.display();
		
	}
	
	
	
	
}
