package videodownloader;

import model.Video;

public interface IDownloader {
	public Video getVideo(String videoName);
}
