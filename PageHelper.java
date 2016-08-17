package tr.org.linux.kamp2016.blog;

import java.util.ArrayList;
import java.util.List;

public class PageHelper {
	private static List<Pages> pageList = new ArrayList<Pages>();
	private static List<Post> videoPostList = new ArrayList<Post>();
	private static List<Post> textPostList = new ArrayList<Post>();

	public static void addPage(Pages page) {
		pageList.add(page);
	}

	public static void addPost(Post post) {
		if (post instanceof VideoPost) {
			videoPostList.add(post);
		}
		if (post instanceof TextPost){
			textPostList.add(post);
		}
	}

	public static List<Pages> getPageList() {
		return pageList;
	}

	public static List<Post> getVideoPostList() {
		return videoPostList;
	}

	public static List<Post> getTextPostList() {
		return textPostList;
	}

}
