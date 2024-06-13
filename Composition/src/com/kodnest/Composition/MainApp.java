package com.kodnest.Composition;

class Page{
	String content;

	public Page(String content) {

		this.content = content;
	}
	void display() {
		System.out.println("Content");
	}

}
class Book{
	Page page;

	public Book(String content) {
		this.page=new Page(content);

	}
	void ReadPage() {
		System.out.println("Reading the pages");
	}


}
public class MainApp {
	public static void main(String[] args) {
		Book book=new Book("this is a book");
		book.ReadPage();              //if this line is here then output will shown

		book=null;
//		book.ReadPage();           //if this is here one exception error Displayed 

	}

}
