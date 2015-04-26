package org.mperets.find_tickets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

/**
 * Created by User on 13.04.15.
 */
public class Main {

    public static void main(String[] args) {
        ParameterFileReader parameterFileReader = new ParameterFileReader();
        List<SearchParameters> searchParameterList = parameterFileReader.read();
        Collection<String> urlString = new ArrayList<>();
        for (SearchParameters searchParameter : searchParameterList)
        {
            CheapTicketsURLPreparer cheapTicketsURLPreparer = new CheapTicketsURLPreparer(searchParameter);
            urlString.add(cheapTicketsURLPreparer.createURLString());
        }

        new Requester().getHtml(urlString);
    }
}
