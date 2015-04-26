package org.mperets.find_tickets;

import javax.swing.text.DateFormatter;
import java.net.URL;
import java.net.URLEncoder;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by User on 13.04.15.
 */
public class CheapTicketsURLPreparer implements URLPreparer {
    private  final SearchParameters searchParameters;

    public CheapTicketsURLPreparer(SearchParameters searchParameters)
    {
        this.searchParameters = searchParameters;
    }

    @Override
    public String createURLString() {


        String URL = "http://www.cheaptickets.com/shop/home?type=air&ar.type=roundTrip&strm=true&ar.rt.leaveSlice.orig.key="+
        searchParameters.getArrivalAirport() + "&ar.rt.leaveSlice.dest.key=" + searchParameters.getDepartureAirport()+
                "&_ar.rt.leaveSlice.destinationRadius=0&ar.rt.leaveSlice.date=" + formatURLDate(searchParameters.getArrivalDate()) +
                "&ar.rt.returnSlice.date="+formatURLDate(searchParameters.getDepartureDate()) +
                "&ar.rt.returnSlice.time=Anytime&_ar.rt.flexAirSearch=0&ar.rt.numAdult=1&ar.rt.numSenior=0" +
                "&ar.rt.numChild=0&ar.rt.child%5B0%5D=&ar.rt.child%5B1%5D=&ar.rt.child%5B2%5D=&ar.rt.child%5B3%5D=&ar.rt.child%5B4%5D=&ar.rt.child%5B5%5D=&ar.rt.child%5B6%5D=&ar.rt.child%5B7%5D=" +
                "&search=Search+Flights&_ar.rt.nonStop=0&_ar.rt.narrowSel=0&ar.rt.narrow=airlines&ar.rt.carriers%5B0%5D=&ar.rt.carriers%5B1%5D=&ar.rt.carriers%5B2%5D=&ar.rt.cabin=C"
        ;
        return URL;
    }

    public static void main (String[] args)
    {
       CheapTicketsURLPreparer cheapTicketsURLPreparer = new CheapTicketsURLPreparer(new SearchParameters("NYC"));
        System.out.println(cheapTicketsURLPreparer.createURLString());
    }

    private static String formatURLDate(Date dateD) {
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yy");
        return URLEncoder.encode(dateFormat.format(dateD));
    }


}
