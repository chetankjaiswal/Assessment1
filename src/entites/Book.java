package entites;

public class Book {
	
	private String bookName;
	private String bookTopic;
	private String author;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(String bookName, String bookTopic, String author) {

		this.bookName = bookName;
		this.bookTopic = bookTopic;
		this.author = author;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookTopic() {
		return bookTopic;
	}

	public void setBookTopic(String bookTopic) {
		this.bookTopic = bookTopic;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book Name=" + bookName +"\n"+ "Book Topic="+ bookTopic +"\n"+ "Author=" + author+"\n";
	}
	
	
}
