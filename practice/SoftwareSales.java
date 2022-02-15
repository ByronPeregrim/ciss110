import java.util.Scanner;

public class SoftwareSales
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter number of packages purchased: ");
        var packages = keyboard.nextInt();
        double discountPrice;
        double discount;
        var originalPrice = packages * 99;
        if (packages >= 100)
        {
            discountPrice = originalPrice * 0.5;
            System.out.printf("Your discount is: $%.2f\n", discountPrice);
            System.out.printf("Your total is: $%.2f\n", discountPrice);
        }
        else if (packages >= 50)
        {
            discount = originalPrice * 0.4;
            discountPrice = originalPrice * 0.6;
            System.out.printf("Your discount is: $%.2f\n", discount);
            System.out.printf("Your total is: $%.2f\n", discountPrice);
        }
        else if (packages >= 20)
        {
            discount = originalPrice * 0.3;
            discountPrice = originalPrice * 0.7;
            System.out.printf("Your discount is: $%.2f\n", discount);
            System.out.printf("Your total is: $%.2f\n", discountPrice);
        }
        else if (packages >= 10)
        {
            discount = originalPrice * 0.2;
            discountPrice = originalPrice * 0.8;
            System.out.printf("Your discount is: $%.2f\n", discount);
            System.out.printf("Your total is: $%.2f\n", discountPrice);
        }
        else if (packages >= 1)
        {
            discount = originalPrice * 0;
            discountPrice = originalPrice * 1;
            System.out.printf("Your discount is: $%.2f\n", discount);
            System.out.printf("Your total is: $%.2f\n", discountPrice);
        }
        else
        {
            discount = originalPrice * 0;
            discountPrice = originalPrice * 0;
            System.out.printf("Your discount is: $%.2f\n", discount);
            System.out.printf("Your total is: $%.2f\n", discountPrice);
        }
    }
}