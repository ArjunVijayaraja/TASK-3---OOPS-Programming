package Oops_Programming;

public class Book {
    private int bookID;
    private String title;
    private String author;
    private Boolean isAvailable;

    public Boolean getAvailable() {
        return isAvailable;
    }

    public void setAvailable(Boolean available) {
        isAvailable = available;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public Book(int bookID, String title, String author, Boolean isAvailable){
        this.bookID = bookID;
        this.title = title;
        this.author= author;
        this.isAvailable = isAvailable;
    }

    @Override
    public String toString(){
        return "Book ID : '"+this.bookID+"' Book Title : '"+this.title+"' Book Author : '"+this.author+"' IsAvailable : '"+isAvailable+"'";
    }

}
