package org.mperets.find_tickets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * Created by User on 21.04.15.
 */
public class Requester {
    public Collection<String> getHtml(Collection<String> URLs) {
        Collection<String> result = new ArrayList<String>(URLs.size());
        try {

            for (String stringUrl : URLs)
            {
                URL url = new URL(stringUrl);
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                httpURLConnection.setRequestMethod("GET");
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                String htmlPage = getFullHtml(bufferedReader);
                result.add(htmlPage);
            }
        } catch (Exception ex) {
            System.out.println("ERROR" + ex);
        }
        System.out.println(result);
        return result;
    }

    private String getFullHtml(BufferedReader bufferedReader) throws IOException {
        String line;
        StringBuilder htmlPage = new StringBuilder("");
        while ((line = bufferedReader.readLine()) != null)
        {
           htmlPage.append(line);
        }
        return htmlPage.toString();
    }
}
