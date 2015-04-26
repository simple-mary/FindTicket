package org.mperets.find_tickets;

import java.io.*;
import java.util.List;

/**
 * Created by User on 26.04.15.
 */
public class ParameterFileReader {

    private static final String FILE_NAME = "/destination.txt";

    public List<SearchParameters> read ()
    {
        String line;
        try (
                InputStream fis = FileInputStream.class.getResourceAsStream(FILE_NAME);
                InputStreamReader isr = new InputStreamReader(fis);
                BufferedReader br = new BufferedReader(isr);
            )
        {
            while ((line = br.readLine()) != null) {

                System.out.println(line);
            }
    } catch (IOException e)
        {
            e.printStackTrace();
        }
        return null;
    }

    public static void main (String[] args)
    {
        new ParameterFileReader().read();
    }
}


