package tr.org.linux.kamp2016.blog;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class Comment {
	private static String author;
	private static String text;
	private static LocalDate commentDate;
	
	public Comment(String author, String text) {
		this.author = author;
		this.text = text;
		this.commentDate = commentDate;
	}
	
	public static String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public  static String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public   static LocalDate getCommentDate() {
		return commentDate;
	}
	public void setCommentDate(LocalDate commentDate) {
		this.commentDate = commentDate;
	}
	
}