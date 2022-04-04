
public class PeregrimCustomer
{
    private String id;
    private String name;
    private char level;
    private String phoneNumber;

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
}