package org.mperets.find_tickets;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by User on 13.04.15.
 */
public class SearchParameters {
    final String arrivalAirport;
    final String departureAirport;
    final Date arrivalDate;
    final Date departureDate;
    final boolean freeDate;

    public SearchParameters(String arrivalAirport, String departureAirport, Date arrivalDate, Date departureDate, boolean freeDate) {
        this.arrivalAirport = arrivalAirport;
        this.departureAirport = departureAirport;
        this.arrivalDate = arrivalDate;
        this.departureDate = departureDate;
        this.freeDate = freeDate;
    }

    public SearchParameters(String departureAirport, Date baseDate) {
        this.departureAirport = departureAirport;
        arrivalAirport = "IEV";
        arrivalDate = baseDate;
        departureDate = new Date(arrivalDate.getTime()+TimeUnit.DAYS.toMillis(14));
        freeDate = true;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public Date getArrivalDate() {
        return arrivalDate;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public boolean isFreeDate() {
        return freeDate;
    }

    @Override
    public String toString() {
        return "SearchParameters{" +
                "arrivalAirport='" + arrivalAirport + '\'' +
                ", departureAirport='" + departureAirport + '\'' +
                ", arrivalDate=" + arrivalDate +
                ", departureDate=" + departureDate +
                ", freeDate=" + freeDate +
                '}';
    }
}

