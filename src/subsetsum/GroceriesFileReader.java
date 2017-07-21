package subsetsum;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class GroceriesFileReader
{
    /**
     * Read the input text file.
     * @param Path path to input file
     * @return list of grocery prices
     */
    public ArrayList<Double> readFile(String Path)
    {
        ArrayList<Double> groceryPrices = new ArrayList<Double>();

        Scanner scanner;

        try
        {
            scanner = new Scanner(new File(Path));
            while(scanner.hasNext())
            {
                String food = scanner.next();
                String delim = "[,]";
                String[] tokens = food.split(delim);

                groceryPrices.add(Double.parseDouble(tokens[1]));
            }
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        return groceryPrices;
    }
}
