package tr.org.linux.kamp2016.blog;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Currency;
import java.util.List;
import java.util.Scanner;

public abstract class Post extends Pages {

	private String type;

	public Post(String type, String title, String body, String category) {
		super(title, body, category);
		this.type = type;
		LocalDateTime date = LocalDateTime.now();

	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	// ////////////////////////////////////////////////POST OLUŞTURMA METHODU
	public static void createPost() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Post's type:");
		String type = input.nextLine();

		System.out.println("Enter the title:");
		String title = input.nextLine();

		System.out.println("Enter the body:");
		String body = input.nextLine();

		System.out.println("Enter the category:");
		String category = input.nextLine();

		if (type.equals("VideoPost")) {
			System.out.println("Enter the url:");
			String url = input.nextLine();
			VideoPost video = new VideoPost(title, body, category, type, url);
			PageHelper.addPost(video);
			System.out.println("Your VideoPost is created");
		}
		if (type.equals("TextPost")) {
			TextPost text = new TextPost(type, title, body, category);
			PageHelper.addPost(text);
			// System.out.println(text.getSummary());
			System.out.println("Your TextPost is created");
		}

	}

	// ///////////////////////////////////////////////POSTLARI BASTIRAN METHOD
	public static void printListPosts() {
		Scanner reader = new Scanner(System.in);
		System.out.println("Select a type: ");
		String type = reader.nextLine();
		if (type.equals("VideoPost")) {
			Post.printVideoPost(PageHelper.getVideoPostList());
		}
		if (type.equals("TextPost")) {
			System.out.println("TextPost list");
			Post.printTextPost(PageHelper.getTextPostList());
		}
		System.out.println("Enter page number to see:");
		String inputStr = reader.nextLine();
		int input = Integer.parseInt(inputStr);
		input = input -1;

		Post post = PageHelper.getVideoPostList().get(input);
		System.out.println("Name: ");
		String name = reader.nextLine();
		System.out.println("Text: ");
		String text = reader.nextLine();
		Comment comment = new Comment(name, text);
		System.out.println("Your comment is added");
		Pages.setComments(comment);
		
	}
/////////////////////////////////////////////////////////////PRİNT POST METHODU
	public static void printVideoPost(List<Post> videoList) {
		System.out.println("=====Showing VideoPost======");
		if(PageHelper.getVideoPostList().size() == 0){
			System.out.println("No such file");
		}
		int index = 1;
		for (Post post : PageHelper.getVideoPostList()) {
			System.out.println(index + "-) Title: "
					+ videoList.get(index - 1).getTitle());
			index++;

		}
	}

	public static void printTextPost(List<Post> textList) {
		System.out.println("=====Showing TextPost======");
		if(PageHelper.getTextPostList().size() == 0){
			System.out.println("No such file");
		}
		int index = 1;
		for (Post post : PageHelper.getTextPostList()) {
			System.out.println(index + "-) Title: "
					+ textList.get(index - 1).getTitle());
			String summary = TextPost.getSummary();

		}
	}

	// ////////////////////////////////////////////////////SHOW POST METHODU
	public static void showVideoPost() {
		System.out.println("=====Showing VideoPost======");
		if(PageHelper.getTextPostList().size() == 0){
			System.out.println("No such file");
		}
		int index = 0;
		for (Post post : PageHelper.getVideoPostList()) {
			System.out.println(index + 1 + "-) Title: " + post.getTitle());
			System.out.println("Comments: "+post.getComments());
		}
	}

	public static void showTextPost() {
		System.out.println("=====Showing TextPost======");
		if(PageHelper.getTextPostList().size() == 0){
			System.out.println("No such file");
		}
		int index = 1;
		for (Post post : PageHelper.getTextPostList()) {
			System.out.println(index + "-) Title: " + post.getTitle());
			String summary = TextPost.getSummary();
		}
	}

	
}
