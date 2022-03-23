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

            while (inputFile.hasNext())
            {
                String id = inputFile.nextLine();
                String name = inputFile.nextLine();
                String number = inputFile.nextLine();
                String phoneNumber = number.replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1) $2-$3");
                String customerLevel = inputFile.nextLine();
                String discount;
                
                switch (customerLevel) {
                    case "A": discount = "20%";
                              break;
                    case "B": discount = "15%";
                                break;
                    case "C": discount = "10%";
                                break;
                    case "D": discount = "5%";
                                break;
                    default: discount = "Invalid Level";
                                break;
                }

                System.out.println("------------------------------");
                System.out.printf("Customer:           %s\n", name);
                System.out.printf("Customer ID:        %s\n", id);
                System.out.printf("Phone Number:       %s\n", phoneNumber);
                System.out.printf("Discount:           %s\n", discount);
            }
        inputFile.close();
        }

        else
        {
            System.out.println("The file customerInput.txt does not exist.");
        }
    }
}