import java.util.Scanner;

public class PeregrimTickets3
{
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args)
    {
        displayTicketPrices();
        double calculatedPrice = calculatePrice(getStadium(), getNumTickets());
        displayTotal(calculatedPrice);
    }

    public static void displayTicketPrices()
    {
        System.out.println("G'day mate! Welcome to the Australian Open!\n");
        System.out.println("Choose an Arena:\n");
        System.out.println("\t[R]od Laver       $225.25");
        System.out.println("\t[M]argaret Court  $177.75");
        System.out.println("\t[J]ohn Cain       $145.50\n");
    }

    public static char getStadium()
    {
        System.out.println("Enter R, M, or J:");
        String charInput = keyboard.nextLine();
        char arenaSelection = charInput.charAt(0);
      
        while (!(arenaSelection == 'R' || arenaSelection == 'M' || arenaSelection == 'J')){
            System.out.println("Invalid value entered. Enter R, M, or J:");
            charInput = keyboard.nextLine();
            arenaSelection = charInput.charAt(0);
        }

        return arenaSelection;
    }
    
    public static int getNumTickets(){
        System.out.println("Enter number of tickets:");
        int numOfTickets = keyboard.nextInt();

        while (!(numOfTickets > 0 && numOfTickets < 21))
        {
            System.out.println("Incorrect value entered. Enter number of tickets:");
            numOfTickets = keyboard.nextInt();
        }

        return numOfTickets;
    }

    public static double calculatePrice(char stadium, int numTickets)
    {
        double ticketPrice = 0;
        switch (stadium)
        {
            case 'R':
                ticketPrice = 225.25;
                break;
            case 'M':
                ticketPrice = 177.75;
                break;
            case 'J':
                ticketPrice = 145.50;
                break;
            default:
                System.out.println("ERROR");
        }
        return ticketPrice * numTickets;
    }

    public static void displayTotal(double price)
    {
        double totalCost = applyTax(price);
        System.out.printf("Your day of amazing tennis will cost: $%.2f\n", totalCost);
    }
    
    public static double applyTax(double priceBeforeTax)
    {
        return priceBeforeTax * 1.1;
    }


}