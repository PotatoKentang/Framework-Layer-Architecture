package main;

import proxy.Proxy;
import videodownloader.IDownloader;
import videodownloader.VideoDownloader;

public class Main {

	public Main() {
//		VideoDownloader vd = new VideoDownloader();
//		vd.getVideo("Dog");
//		vd.getVideo("Cat");
//		vd.getVideo("Dog");
		
		Proxy videoProxy = new Proxy();
		videoProxy.getVideo("Dog");
		videoProxy.getVideo("Cat");
		videoProxy.getVideo("Dog");
		
		
	}
	
	public static void main(String[] args) {
		new Main();
	}

}
