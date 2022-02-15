import java.util.Scanner;

public class PeregrimTickets
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("G'day mate! Welcome to the Australian Open!\n");
        
        System.out.println("Choose an Arena:\n");

        System.out.println("\t[R]od Laver       $225.25");
        System.out.println("\t[M]argaret Court  $177.75");
        System.out.println("\t[J]ohn Cain       $145.50\n");

        System.out.println("Enter R, M, or J:");
        var charInput = keyboard.nextLine();
        var arenaSelection = charInput.charAt(0);
        double ticketPrice = 0;
        if (arenaSelection == 'R')
            ticketPrice = 225.25;
        else if (arenaSelection == 'M')
            ticketPrice = 177.75;
        else if (arenaSelection == 'J')
            ticketPrice = 145.50;
        else 
            System.out.println("ERROR");

        System.out.println("Enter number of tickets:");
        int numOfTickets = keyboard.nextInt();

        double totalCost = ticketPrice * numOfTickets;

        System.out.println("Your day of amazing tennis will cost: $" + totalCost);
    }
}