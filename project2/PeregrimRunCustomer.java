import java.util.Scanner;
import java.io.*;


public class PeregrimRunCustomer
{
    public static void main(String[] args) throws IOException
    {
        File file = new File("customerInput.txt");
        
        if (file.exists())
        {
            Scanner inputFile = new Scanner(file);

            PeregrimCustomer Customer;

            while (inputFile.hasNext())
            {
                String id = inputFile.nextLine();
                String name = inputFile.nextLine();
                String number = inputFile.nextLine();
                String phoneNumber = number.replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1) $2-$3");
                String customerLevel = inputFile.nextLine();
                char level = customerLevel.charAt(0);
                String orderTotal = inputFile.nextLine();
                double total = Double.parseDouble(orderTotal);
                
                int discount;

                Customer = new PeregrimCustomer(id, name, level, phoneNumber);
                
                switch (customerLevel) {
                    case "A": discount = 20;
                              break;
                    case "B": discount = 15;
                                break;
                    case "C": discount = 10;
                                break;
                    case "D": discount = 5;
                                break;
                    default: discount = 0;
                                break;
                }

                double totalAfterDiscount = ((100.00-discount) / 100.00) * total;

                System.out.println("------------------------------");
                System.out.printf("Customer:              %s\n", name);
                System.out.printf("Customer ID:           %s\n", id);
                System.out.printf("Phone Number:          %s\n", phoneNumber);
                System.out.printf("Total:                 $%.2f\n", total);
                System.out.printf("Discount:              %s%%\n", discount);
                System.out.printf("Total after discount:  $%.2f\n", totalAfterDiscount);
            }
        inputFile.close();
        }

        else
        {
            System.out.println("The file customerInput.txt does not exist.");
        }
    }
}