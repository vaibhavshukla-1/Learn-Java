package BookandAuthor;

public class Author {
    private String name;
    private String email;
    private char gender;

    // Constructors
    public Author() {}
    
    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    // Getters and Setters

    public String getName() {
        return name;
    }
    
    public String getemail() {
        return email;
    }

    public void setemail(String email) {
        this.email = email;
    }

    public char getgender() {
        return gender;
    }

    public String toString()
    {
      String result = "Author[name = " + getName() + " , email = " + getemail() + " , gender = " + getgender() + "]";
      return result;
    }
    }
