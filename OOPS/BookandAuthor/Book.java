package BookandAuthor;

public class Book
{
    private String name;
    private Author author;
    private double price;
    private int quantity = 0;

    // Constructor

    public Book(String name, Author author , double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public Book(String name, Author author , double price , int quantity) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters and Setters
    
    public String getname() {
        return name;
    }

    public Author getAuthor() {
        return author;
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
      String result = "Book[name = " + getname() + " , " +  getAuthor() + " , price = " + getPrice() + " , quantity = " + getquantity() + "]";
      return result;
    }

    public String getAuthorName() {
        return author.getName();
    }

    public String getAuthorEmail() {
        return author.getemail();
    }

    public char getAuthorGender() {
        return author.getgender();
    }

}