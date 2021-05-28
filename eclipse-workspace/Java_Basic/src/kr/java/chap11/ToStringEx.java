package kr.java.chap11;
import kr.java.chap10.ex.*;

class Book {
	int bookNumber;
	String bookTitle;
	
	Book(int bookNumber, String bookTitle) {
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}
	
	@Override
	public String toString() {
		Class c = getClass();
		
		return getClass().getName() + 
				'@' + 
				Integer.toHexString(hashCode()) + " -> "+  bookTitle + "," + bookNumber;
	}
}



public class ToStringEx {
	public static void main(String[] args) {
		Book book1 = new Book(200,"개미");
		
		System.out.println(book1);
		System.out.println(book1.toString());
		
		String str = new String("알고리즘");
		Integer i1 = new Integer(1000);
		System.out.println(str);
		System.out.println(i1);
		
		Drawable d = new Drawable() {
			
			@Override
			public void draw(int color) {
		}
		};
		
		DrawableMain dm = new DrawableMain();
		
		System.out.println(d);
		System.out.println(dm);
		
	}
}
