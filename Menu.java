package tr.org.linux.kamp2016.blog;

public class Menu {
	
	public void printMenu(){
		StringBuilder menu = new StringBuilder();
		
		menu.append("MENU\n");
		menu.append("==========");
		
		menu.append("(1) Add Page\n");
		menu.append("(2) Add Post\n");
		menu.append("(3) Add Comment\n");
		menu.append("(4) Show Pages\n");
		menu.append("(5) Show Posts\n");
		
		System.out.println(menu.toString());
		
	}
}
