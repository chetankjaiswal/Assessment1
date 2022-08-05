package Operations;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import entites.Book;

public class Operations {
	
    ArrayList<Book> bookList = new ArrayList<Book>();
	Scanner sc= new Scanner(System.in);
	
	public static void operations() {
		Operations o = new Operations();
		Scanner sc=new Scanner(System.in);
		int choice=0;
		while(true) {
			try {
			System.out.println("1.Add Book");
			System.out.println("2.View All Book");
			System.out.println("3.View Book by Book Name");
			System.out.println("4.View Book by Book Author");
			System.out.println("5.View Book by Book Topic");
			System.out.println("6.Delete Book");
			System.out.println("7.Exit");
			System.out.println("Enter your choice");
			choice=sc.nextInt();
					
			switch(choice) {
			case 1:
				o.addBook();
				break;
			case 2:
				o.viewAllBooks();
				break;
			case 3:
				o.viewBookByBookName();
				break;
			case 4:
				o.viewBookByBookAuthor();
				break;
			case 5:
				o.viewBookByBookTopic();
				break;
			case 6:
				o.deleteBookByBookName();
				break;
			case 7:
				System.out.println("Thank You");
				System.exit(0);
			default :
				sc.close();
				System.out.println("Wrong choice please Enter valid choice");
				
			}
			
		   }
			catch(Exception ex) {
				System.out.println("Please Enter Valid Number");
				operations();
			}
		 }
		
		
	
	}

	
	public void addBook() {
		
		Book book = new Book();
		System.out.println("Enter Book Name");
		book.setBookName(sc.nextLine());
		System.out.println("Enter Book Topic");
		book.setBookTopic(sc.nextLine());
		System.out.println("Enter Book Author");
		book.setAuthor(sc.nextLine());
		
		bookList.add(book);
	}
	
	
	public void viewAllBooks() {
	
		System.out.println("Book Details :");
		Iterator<Book> itr= bookList.iterator();
		while(itr.hasNext())
		{
			Book book = itr.next();
			System.out.println(book);
		}
	
	}
	
	
	public void viewBookByBookName() {
		
		System.out.println("Enter Book Name");
		String findBook=sc.nextLine();
		boolean found=false;
		Iterator<Book> itr=bookList.iterator();
		Book book;
		try {
		     while(itr.hasNext()) {
			 book=itr.next();
			  if(findBook.equals(book.getBookName())){
				found=true;
				System.out.println(book);
			 }
		    }
		     if(!found) {
		    	 throw new WrongBookName("Please enter correct Book Name");
		     }
	      }
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	
	public void viewBookByBookAuthor() {
		System.out.println("Enter Author");
		String findAuthor=sc.nextLine();
		boolean found=false;
		Iterator<Book> itr=bookList.iterator();
		Book book;
		try {
		     while(itr.hasNext()) {
			 book=itr.next();
			  if(findAuthor.equals(book.getAuthor())){
				found=true;
				System.out.println(book);
			 }
		    }
		     if(!found) {
		    	 throw new WrongAuthorName("Please enter correct Author Name");
		     }
	      }
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	
	public void viewBookByBookTopic() {
		System.out.println("Enter Topic");
		String findTopic=sc.nextLine();
		boolean found=false;
		Iterator<Book> itr=bookList.iterator();
		Book book;
		try {
		     while(itr.hasNext()) {
			 book=itr.next();
			  if(findTopic.equals(book.getBookTopic())){
				found=true;
				System.out.println(book);
			 }
		    }
		     if(!found) {
		    	 throw new WrongTopicName("Please enter correct Author Name");
		     }
	      }
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public void deleteBookByBookName() {
		System.out.println("Enter Book Name");
		String findBook=sc.nextLine();
		boolean found=false;
		Iterator<Book> itr=bookList.iterator();
		Book book;
		try {
		     while(itr.hasNext()) {
			 book=itr.next();
			  if(findBook.equals(book.getBookName())){
				found=true;
				System.out.println(book);
				System.out.println("Delete this Book\n yes or no");
				if("yes".equals(sc.nextLine())){
				itr.remove();
				System.out.println("Book Removed Successfuly");
				}
			 }
		    }
		     if(!found) {
		    	 throw new WrongBookName("Please enter correct Book Name");
		     }
	      }
		catch(Exception e) {
			System.out.println(e);
		}
	}
}


class WrongBookName extends Exception{
	
	WrongBookName(String msg){
		super(msg);
	}
}

class WrongAuthorName extends Exception{

	WrongAuthorName(String msg){
		super(msg);
	}
}

class WrongTopicName extends Exception{

	WrongTopicName(String msg){
		super(msg);
	}
}