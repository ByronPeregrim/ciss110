import java.util.Scanner;
import java.io.*;


public class PeregrimRunCustomer
{
    public static void main(String[] args) throws IOException
    {
        PeregrimCustomer[] array = new PeregrimCustomer[8];

        File file = new File("customerInput.txt");
        
        if (file.exists())
        {
            Scanner inputFile = new Scanner(file);

            PeregrimCustomer Customer;

            int count = 0;

            while (inputFile.hasNext())
            {
                String id = inputFile.nextLine();
                String name = inputFile.nextLine();
                String number = inputFile.nextLine();
                String phoneNumber = number.replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1) $2-$3");
                String customerLevel = inputFile.nextLine();
                char level = customerLevel.charAt(0);
                String total = inputFile.nextLine();
                double orderTotal = Double.parseDouble(total);
                
                Customer = new PeregrimCustomer(id, name, level, phoneNumber);
                Customer.setOrderTotal(orderTotal);

                array[count] = Customer;

                count++;

            }

            printCustomers(array);

            inputFile.close();
        }

        else
        {
            System.out.println("The file customerInput.txt does not exist.");
        }
    }

    public static void printCustomers(PeregrimCustomer[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            array[i].display();
        }
    }
}