package BookandAuthor;

public class Book
{
    private String name;
    private Author author;
    private double price;
    private int quantity = 0;

    // Constructors
    public Book() {}

    public Book(String name, Author author , double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public Book(String name, Author author , int quantity) {
        this.name = name;
        this.author = author;
        this.quantity = quantity;
    }

    // Getters and Setters
    public String getname() {
        return name;
    }

    public String getAuthor() {
        return author.getName();
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
}