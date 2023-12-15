package proxy;

import java.util.ArrayList;
import java.util.HashMap;

import model.Video;
import videodownloader.IDownloader;
import videodownloader.VideoDownloader;

public class Proxy implements IDownloader{
	HashMap<String, Video> cache = new HashMap<>();
	VideoDownloader vd = new VideoDownloader();
	public Proxy() {
		this.vd = new VideoDownloader();
	}

	@Override
	public Video getVideo(String videoName) {
		// TODO Auto-generated method stub
		if(this.cache.containsKey(videoName)){
			return this.cache.get(videoName);
		}
		Video data = this.vd.getVideo(videoName);
		this.cache.put(videoName, data);
		return data;
		
	}
}
