package CustomerAndInvoice;

public class Customer {
    private int id;
    private String name;
    private int discount;

    //Constructor
    
    Customer(int id,String name,int discount)
    {
        this.id = id;
        this.name = name;
        this.discount = discount;
    }

    //Getters & Setters

    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public String toString()
    {
      String result = getName()+"("+getId()+")"+"("+getDiscount()+"%)";
      return result;
    }

}
