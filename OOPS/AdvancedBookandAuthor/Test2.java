/*
Notes:

The constructors take an array of Author (i.e., Author[]), instead of an Author instance. In this design, once a Book instance is constructor, you cannot add or remove author.
The toString() method shall return "Book[name=?,authors={Author[name=?,email=?,gender=?],......},price=?,qty=?]".


You are required to:

Write the code for the Book class. You shall re-use the Author class written earlier.
Write a test driver (called TestBook) to test the Book class.
*/
package AdvancedBookandAuthor;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<Author> authors = new ArrayList<>();
        authors.add(new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'M'));
        authors.add(new Author("Paul Tan", "Paul@nowhere.com", 'M'));

        Book javaDummy = new Book("Java for Dummy", authors, 19.99, 99);
        System.out.println(javaDummy);
    }
}
