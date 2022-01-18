import classes.Book;

public class Main {
    public static void main(String[] args) {
		Book book = new Book();
		book.setAuthor("Zhantore Yessen");
		book.setBookName("Who am I?");
		
		System.out.println("book:" + book.getBookName()+ ", author: " + book.getAuthor());
    }
}
