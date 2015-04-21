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
        SearchParameters searchParameters = new SearchParameters("", "", new Date(), new Date(), true);
        String urlString = new CheapTicketsURLPreparer(searchParameters).createURLString();
        new Requester().getHtml(Collections.singletonList(urlString));
    }
}
