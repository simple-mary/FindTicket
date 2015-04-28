package org.mperets.find_tickets;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


/**
 * Created by User on 28.04.15.
 */
public class PriceParser
{
    public void findPrice(String html)
    {
        Document priceDoc = Jsoup.parse(html);
        Elements prices = priceDoc.select(".price");
        for (Element price : prices)
        {
            System.out.println("The prices: " + price);
        }
    }
}
