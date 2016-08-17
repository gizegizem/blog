package tr.org.linux.kamp2016.blog;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pages {
	private static List<Comment> comments;
	private String title;
	private String body;
	private String category;
	private LocalDateTime date;

	public Pages(String title, String body, String category) {
		this.title = title;
		this.body = body;
		this.category = category;
		date = LocalDateTime.now();
		this.comments = new ArrayList();
	}

	public static List<Comment> getComments() {
		return comments;
	}

	public static void setComments(Comment comment) {
		comments.add(comment);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public LocalDateTime getDate() {
		return date;
	}
	

	public static void createPage(){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the title:");
		String title = input.nextLine();

		System.out.println("Enter the body:");
		String body = input.nextLine();

		System.out.println("Enter the category:");
		String category = input.nextLine();
		
		Pages page = new Pages(title,body,category);
		PageHelper.addPage(page);
		System.out.println("Your page is created successfully");
		System.out.println("------------------------------");
	}
	///////////////////////////////////////////////////////////SHOW PAGES
	
	public static void showPage() {
		System.out.println("=====Showing Pages======");
		if(PageHelper.getPageList().size() == 0){
			System.out.println("No such file");
		}
		int index = 1;
		for (Pages page : PageHelper.getPageList()) {
			System.out.println(index + "-) Title: " + page.getTitle());
			index++;
		}
	}
	///////////////////////////////////////////////////////////PRİNT PAGES
	public static void printPages(List<Pages> pageList) {
		System.out.println("=====Showing Pages======");
		if(PageHelper.getPageList().size() == 0){
			System.out.println("No such file");
		}
		int index = 1;
		for (Pages page : PageHelper.getPageList()) {
			System.out.println(index + "-) Title: "
					+ pageList.get(index - 1).getTitle());
			String summary = TextPost.getSummary();

		}
	}
}
