package tr.org.linux.kamp2016.blog;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.println("Please select an option:");
			int action = input.nextInt();
			String str;
			
			if (action == 1) {
				Pages.createPage();
			}
			if (action == 2) {
				Post.createPost();
			}
			if (action == 3) {
				Post.printListPosts();
			}
			if (action == 4) {
				Pages.showPage();
			}
			if (action == 5) {
				Post.showVideoPost();
				Post.showTextPost();
			}
		}

	}

}
