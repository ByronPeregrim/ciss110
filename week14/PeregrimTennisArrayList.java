import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class PeregrimTennisArrayList
{
    public static void main(String[] args) throws IOException
    {
        ArrayList<PeregrimTennisPlayer> playerList = new ArrayList<PeregrimTennisPlayer>();

        fillTennisArrayList(playerList);
        printTennisPlayers(playerList);
    }
    
    public static void fillTennisArrayList(ArrayList<PeregrimTennisPlayer> array) throws IOException
    {   
        Scanner inputFile = new Scanner(new File("tennisplayers.txt"));

        while (inputFile.hasNext())
        {
            String name = inputFile.nextLine();
            String country = inputFile.nextLine();
            int rank = inputFile.nextInt();
            int age = inputFile.nextInt();
            int wins = inputFile.nextInt();
            int losses = inputFile.nextInt();
            
            if (inputFile.hasNext()) 
            {
            inputFile.nextLine();
            };

            PeregrimTennisPlayer player = new PeregrimTennisPlayer(name, country, rank, age, wins, losses);

            array.add(player);
        }
        
        inputFile.close();
    }

    public static void printTennisPlayers(ArrayList<PeregrimTennisPlayer> array)
    {
        for (PeregrimTennisPlayer player: array)
        {
            player.displayPlayer();
        }
    }

}