/*TRY:
Printing the name and email of the author from a Book instance. (Hint: aBook.getAuthor().getName(), aBook.getAuthor().getEmail()).
Introduce new methods called getAuthorName(), getAuthorEmail(), getAuthorGender() in the Book class to return the name, email and gender of the author of the book. 
*/

package BookandAuthor;

public class Test1 {
    public static void main(String args[])
    {
        Author Jim = new Author("Jim Carry","jimcar@email.com",'M');
        Book dummy = new Book("Road to success",Jim,10);
        dummy.setprice(99.00f);
      
        // Printing author name & email using book instance
        System.out.println("Author : " + dummy.getAuthor().getName());
        System.out.println("Email : " + dummy.getAuthor().getemail());

        // Printing author name & email using methods from book class
        System.out.println("Author : " + dummy.getAuthorName());
        System.out.println("Email : " + dummy.getAuthorEmail());
        System.out.println("Gender : " + dummy.getAuthorGender());
    }
}
