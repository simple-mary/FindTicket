package org.mperets.find_tickets;

import java.util.Date;

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
}

