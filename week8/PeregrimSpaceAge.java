import java.util.Scanner;


public class PeregrimSpaceAge
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("What is your age, Earthling?!");
        int age = keyboard.nextInt();

        MercuryAge(age);
        VenusAge(age);
        MarsAge(age);
        JupiterAge(age);
        SaturnAge(age);
        UranusAge(age);
        NeptuneAge(age);
        PlutoAge(age);

    }
    public static void MercuryAge(int earthAge)
    {
        double newAge = earthAge * 4.15;
        System.out.printf("You are %.2f Mercurian years old.\n", newAge);
    }
    public static void VenusAge(int earthAge)
    {
        double newAge = earthAge * 1.62;
        System.out.printf("You are %.2f Venusian years old.\n", newAge);
    }
    public static void MarsAge(int earthAge)
    {
        double newAge = earthAge * .53;
        System.out.printf("You are %.2f Martian years old.\n", newAge);
    }
    public static void JupiterAge(int earthAge)
    {
        double newAge = earthAge / 11.86;
        System.out.printf("You are %.2f Jovian years old.\n", newAge);
    }
    public static void SaturnAge(int earthAge)
    {
        double newAge = earthAge / 29.46;
        System.out.printf("You are %.2f Saturnian years old.\n", newAge);
    }
    public static void UranusAge(int earthAge)
    {
        double newAge = earthAge / 84.00;
        System.out.printf("You are %.2f Uranian years old.\n", newAge);
    }
    public static void NeptuneAge(int earthAge)
    {
        double newAge = earthAge / 164.80;
        System.out.printf("You are %.2f Neptunian years old.\n", newAge);
    }
    public static void PlutoAge(int earthAge)
    {
        double newAge = earthAge / 248.00;
        System.out.printf("You are %.2f Plutonian years old.\n", newAge);
    }
}