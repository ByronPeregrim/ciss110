import java.util.Scanner;

public class calorieCounter
{
    public static void main(String[] args)
    {
        var caloriesPerCookie = 300 / 4;
        System.out.print("Enter number of cookies eaten: ");
        Scanner keyboard = new Scanner(System.in);
        var cookies = keyboard.nextInt();
        var caloriesConsumed = cookies * caloriesPerCookie;
        System.out.println("Your calorie intake was: " + caloriesConsumed +
                        " calories.");
    }
}