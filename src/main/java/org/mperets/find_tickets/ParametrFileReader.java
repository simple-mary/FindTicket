package org.mperets.find_tickets;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

/**
 * Created by User on 26.04.15.
 */
public class ParametrFileReader {

    private static final String FILE_NAME = "destination.txt";
    public List<SearchParameters> read ()
    {
        String line;
        try (
                InputStream fis = new FileInputStream("the_file_name");
                InputStreamReader isr = new InputStreamReader(fis);
                BufferedReader br = new BufferedReader(isr);
        ) {
            while ((line = br.readLine()) != null) {
                // Deal with the line
            }
        return null;
    }
}
