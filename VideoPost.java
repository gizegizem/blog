package tr.org.linux.kamp2016.blog;

import java.time.LocalDateTime;

public class VideoPost extends Post {
	public VideoPost(String type, String title, String body, String category,
			String url) {
		super(type, title, body, category);
		setUrl(url);
	}

	private static String url;

	public static String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
