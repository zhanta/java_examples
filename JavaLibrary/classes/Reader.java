package classes;

import java.util.Date;

public class Reader {
    private String name;
    private String surname;
    private int id;
    private String facultet;
    private String number;
    private Date date;
    private String[] stringArr; 

    public Reader() {}

    public Reader(String name, String surname, int id, String facultet, String number, Date date) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.facultet =facultet;
        this.number = number;
        this.date = date;
        //this.stringArr = ;
    }

    public void takeBook(int numBook) {
        System.out.println(this.name+ " " + this.surname +" taked " + numBook + " books!");

    }

    public void takeBook(String... books) {
        for(String book : books) {
            System.out.println(book);
        }
    }
    public void takeBook(Book...books) {
        System.out.println(this.name + " " + this.surname + " is taked this books:");
        for(Book book : books) {
            System.out.println(book.getBookName() + ", author: "+book.getAuthor());            
        }
        System.out.println();
    }
    

    public void returnBook() {

    }

}
