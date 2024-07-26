package BookandAuthor;

public class Test1 {
    public static void main(String args[])
    {
        Author Jim = new Author("Jim Carry","jimcar@email.com",'M');
        Book dummy = new Book("Road to success",Jim,10);
        dummy.setprice(99.00f);
       /*  System.out.println("Author Name: " + Jim.getName());
        System.out.println("Author Email: " + Jim.getemail());
        System.out.println("Author Gender: " + Jim.getgender());
        System.out.println("Book Name: " + dummy.getname());
        System.out.println("Book Author: " + dummy.getAuthor());
        System.out.println("Book Price: " + dummy.getPrice());
        System.out.println("Book Quantity: " + dummy.getquantity());*/
        System.out.println(Jim.toString());
    }
}
