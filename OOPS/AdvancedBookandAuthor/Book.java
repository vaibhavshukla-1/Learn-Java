package AdvancedBookandAuthor;

import java.util.ArrayList;
import java.util.List;


public class Book {
    private String name;
    private List<Author> authors;
    private double price;
    private int quantity = 0;

    // Constructor

    public Book(String name, List<Author> authors , double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book(String name, List<Author> authors , double price ,int quantity) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters and Setters
    
    public String getname() {
        return name;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public void setprice(double price) {
        this.price = price;
    }

    public int getquantity() {
        return quantity;
    }

    public void setquantity(int quantity) {
        this.quantity = quantity;
    }

    public String toString()
    {
      String result = "Book[name = " + getname() + " , " +  getAuthors() + " , price = " + getPrice() + " , quantity = " + getquantity() + "]";
      return result;
    }

    public List<String> getAuthorName() {
        List<String> Names = new ArrayList<>();
        for(Author author : authors)
        {
            Names.add(author.getName());
        }
        return Names;
    }


}
