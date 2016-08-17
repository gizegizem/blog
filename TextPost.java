package tr.org.linux.kamp2016.blog;

public class TextPost extends Post {
	private static String summary;

	public TextPost(String type, String title, String body, String category) {
		super(type, title, body, category);
		summary = getBody().substring(0, 10);
	}

	public static String getSummary() {
		return summary;
	}
}
