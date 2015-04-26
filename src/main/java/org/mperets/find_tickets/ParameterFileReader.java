package org.mperets.find_tickets;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 26.04.15.
 */
public class ParameterFileReader {

    private static final String FILE_NAME = "/destination.txt";

    public List<SearchParameters> read ()
    {
        String line;
        List<SearchParameters> results = new ArrayList<>();

        try (
                InputStream fis = FileInputStream.class.getResourceAsStream(FILE_NAME);
                InputStreamReader isr = new InputStreamReader(fis);
                BufferedReader br = new BufferedReader(isr);
            )
        {
            while ((line = br.readLine()) != null) {
                SearchParameters searchParameters = new SearchParameters(line);
                results.add(searchParameters);
            }
    } catch (IOException e)
        {
            e.printStackTrace();
        }
        return results;
    }

    public static void main (String[] args)
    {
        System.out.println(new ParameterFileReader().read());
    }
}


