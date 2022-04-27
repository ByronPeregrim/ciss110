import java.util.Scanner;

public class PeregrimTennisWinPercentArray
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("What is the tennis player's name?");
        String name = keyboard.nextLine();

        System.out.println("How many years has " + name + " played competitively?");
        int totalYears = keyboard.nextInt();

        double[] array = new double[totalYears];

        System.out.println("What year did the player begin playing competitively?");
        int firstYear = keyboard.nextInt();
        int lastYear = firstYear + totalYears;

        int count = 0;

        for (int i = firstYear; i < lastYear; i++)
        {
            System.out.println("Enter wins for year " + i + ": ");
            double wins = keyboard.nextDouble();

            System.out.println("Enter losses for year " + i + ": ");
            double losses = keyboard.nextDouble();

            double winPercentage = (wins / (wins + losses)) * 100;

            array[count] = winPercentage;

            count++;
        }

        printWinPercentage(name, firstYear, array);
    }

    public static void printWinPercentage(String playerName, int firstYearOfPlay, double[] winPercentArray)
    {
        System.out.println(playerName + "'s Winning Percentage By Year: ");
        for (double percentages : winPercentArray)
        {
            System.out.printf("Year: %d  Winning Percentage %.1f%% \n", firstYearOfPlay, percentages);

            firstYearOfPlay++;
        }

    }

}