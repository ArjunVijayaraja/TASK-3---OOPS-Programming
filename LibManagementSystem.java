package Oops_Programming;

public class LibManagementSystem extends Library{
    public static void main(String[] args) {
        Book b1 = new Book(01,"FIRST_BOOK","Arjun",true);
        Book b2 = new Book(02,"SECOND_BOOK","RAJA",true);
        Book b3 = new Book(03,"THIRD_BOOK","VICKY",true);
        Book b4 = new Book(04,"FOURTH_BOOK","VICKY1",true);
        Book b5 = new Book(05,"FIFTH_BOOK","VICKY11",true);
        Book b6 = new Book(06,"SIXTH_BOOK","VICKY88",true);
        Library Lib = new Library();
        Lib.addBook(b1);
        Lib.addBook(b2);
        Lib.addBook(b3);
        Lib.addBook(b4);
        Lib.addBook(b5);
        Lib.addBook(b6);

        Lib.removeBook(01);
        Lib.display(03);
        Lib.display();
    }
}
