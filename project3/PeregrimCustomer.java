
public class PeregrimCustomer
{
    private String id;
    private String name;
    private char level;
    private String phoneNumber;
    private double orderTotal;



    public PeregrimCustomer() 
    {
        id = "";
        name = "";
        level = 'Z';
        phoneNumber = "";
    }

    public PeregrimCustomer(String i, String n, char l, String p)
    {
        id = i;
        name = n;
        level = l;
        phoneNumber = p;
    }

    public void setId(String i)
    {
        id = i;
    }

    public void setName(String n)
    {
        name = n;
    }

    public void setLevel(char l)
    {
        level = l;
    }

    public void setPhoneNumber(String p)
    {
        phoneNumber = p;
    }

    public void setOrderTotal(double d)
    {
        orderTotal = d;
    }

    public String getId() 
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public char getLevel()
    {
        return level;
    }
    
    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public double getOrderTotal()
    {
        return orderTotal;
    }

    public void display()
    {
        int discount;

        switch (level) {
            case 'A': discount = 20;
                      break;
            case 'B': discount = 15;
                        break;
            case 'C': discount = 10;
                        break;
            case 'D': discount = 5;
                        break;
            default: discount = 0;
                        break;
        }

        double totalAfterDiscount = ((100.00-discount) / 100.00) * orderTotal;

        System.out.println("------------------------------");
        System.out.printf("Customer:              %s\n", name);
        System.out.printf("Customer ID:           %s\n", id);
        System.out.printf("Phone Number:          %s\n", phoneNumber);
        System.out.printf("Total:                 $%.2f\n", orderTotal);
        System.out.printf("Discount:              %s%%\n", discount);
        System.out.printf("Total after discount:  $%.2f\n", totalAfterDiscount);
    }
}