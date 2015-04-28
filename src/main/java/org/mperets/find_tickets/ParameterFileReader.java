package org.mperets.find_tickets;

import org.joda.time.DateTime;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 26.04.15.
 */
public class ParameterFileReader
{
    private static final String FILE_NAME = "/destination.txt";
    private static final int MAX_DAYS = 2;

    public List<SearchParameters> read()
    {
        String line;
        List<SearchParameters> results = new ArrayList<>();

        try (InputStream fis = ParameterFileReader.class.getResourceAsStream(FILE_NAME);
             InputStreamReader isr = new InputStreamReader(fis);
             BufferedReader br = new BufferedReader(isr);)
        {
            while ((line = br.readLine()) != null)
            {
                for (int i = 0; i < MAX_DAYS; i++)
                {
                    DateTime dateTime = new DateTime();
                    SearchParameters searchParameters = new SearchParameters(line, dateTime.plusDays(45 + i).toDate());
                    results.add(searchParameters);
                }
            }
        } catch (IOException e)
        {
            e.printStackTrace();
        }
        return results;
    }

    public static void main(String[] args)
    {
        System.out.println(new ParameterFileReader().read());
    }
}


