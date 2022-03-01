import java.util.Scanner;
import java.io.*;

public class PeregrimPartyCount
{
    public static void main(String[] args) throws IOException
    {
        // Create a File object.
        File file = new File("partyResponses.txt");

        // Check if the file exists.
        if (file.exists())
        {
            int willAttend = 0;
            int willNotAttend = 0;

            // Read from text file.
            Scanner inputFile = new Scanner(file);
            while (inputFile.hasNext())
            {
                String name = inputFile.next();
                String response = inputFile.next();

            // Count responses from text file.
            if (response.equals("aye"))
                willAttend++;
            else if (response.equals("naw"))
                willNotAttend++;

            };

            // Print counted responses.
            System.out.println(willAttend + " muckers coming to the great craic!");
            System.out.println(willNotAttend + " sad eegits can't make it.");
            inputFile.close();
        }
        else
        {
            System.out.println("Sorry, that file does not exist.");
        };
    };
};