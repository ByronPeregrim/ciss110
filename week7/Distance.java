import java.util.Scanner;

public class Distance
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);


        //Prompts user for vehicle speed
        System.out.print("Enter vehicle speed (in mph): ");
        int speed = keyboard.nextInt();
        //input validation for speed
        while (speed < 0)
        {
            System.out.print("Enter vehicle speed (in mph): ");
            speed = keyboard.nextInt();
        } 

        //prompts user for input for hours traveled
        System.out.print("Enter traveling time (in hours): ");
        int time = keyboard.nextInt();
        //input validation for time input
        while (time < 1)
        {
            System.out.print("Enter traveling time (in hours): ");
            time = keyboard.nextInt();
        }


        //prints vehicle speed and distance traveled every hour.
        for (int i = 1; i <= time; i++)
        {
            System.out.printf("After %d hour(s) the distance is %d miles.\n", i, (i*speed));
        };

    };
};