import java.util.Scanner;

public class PeregrimBudget
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter the amount budgeted for the month: ");
        int budget = keyboard.nextInt();
        System.out.println("");
        
        System.out.print("Enter the expense (-1 to quit): ");
        int expense = keyboard.nextInt();
        System.out.println("");

        int total = 0;
        int numberOfExpenses = 0;
        while (expense != -1) 
        {
            total += expense;
            System.out.print("Enter the expense (-1 to quit): ");
            expense = keyboard.nextInt();
            System.out.println("");
            numberOfExpenses++;
        };

        System.out.printf("$%d budgeted.\n", budget);

        if (numberOfExpenses > 0)
        {
            System.out.printf("%d expense(s) totaling $%d.\n", numberOfExpenses, total);
        }
        else
        {
            System.out.println("No expenses for the month.\n");
        };

        int differenceOfBudgetAndTotal = budget - total;
        if (differenceOfBudgetAndTotal > 0)
        {
            System.out.printf("$%d under budget.\n", differenceOfBudgetAndTotal);
        }
        else if (differenceOfBudgetAndTotal == 0)
        {
            System.out.println("Expenses equals amount budgeted.");
        }
        else
        {
            int difference = total - budget;
            System.out.printf("$%d over budget.\n", difference);
        };

    };
};