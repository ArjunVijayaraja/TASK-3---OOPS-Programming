package Oops_Programming;

import java.sql.Array;
import java.util.*;

public class Library {
    ArrayList<Book> books = new ArrayList<>();



    public void addBook(Book b){
        books.add(b);
        System.out.println("book added successfully");
        System.out.println();
    }

    public void removeBook(int id){
        System.out.println("Removing......");
        for(int i =0;i<books.size();i++){
            if(books.get(i).getBookID() == id){
                System.out.println("The Book with BOOK ID: "+books.get(i).getBookID()+" was removed");
                books.remove(i);

            }
        }
        System.out.println();

    }

    public void display(int id){
        System.out.println("Displaying the Available Books...with the given ID: "+id );
        for(int i =0;i<books.size();i++){
            if(books.get(i).getBookID() == id){
                System.out.println(books.get(i));
            }
        }
        System.out.println("----------------------------------------");
        System.out.println();
    }

    public void display(){
        System.out.println("Displaying the Available Books...");
        for(int i =0;i<books.size();i++){
            //if(books.get(i).getBookID() == id){
                System.out.println(books.get(i));
            //}
        }
        System.out.println("----------------------------------------");
        System.out.println();
    }


}
