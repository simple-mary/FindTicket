package org.mperets.find_tickets;

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

        return "http://www.cheaptickets.com/shop/home?type=air&ar.type=roundTrip&strm=true&ar.rt.leaveSlice.orig.key=Kiev%2C+Ukraine+-+All+Airports+%28IEV%29&ar.rt.leaveSlice.originRadius=80.0+mi&_ar.rt.leaveSlice.originRadius=0&ar.rt.leaveSlice.dest.key=New+York%2C+New+York+-+All+Airports+%28NYC%29&ar.rt.leaveSlice.destinationRadius=80.0+mi&_ar.rt.leaveSlice.destinationRadius=0&ar.rt.leaveSlice.date=09%2F01%2F15&ar.rt.leaveSlice.time=Anytime&ar.rt.returnSlice.date=09%2F15%2F15&ar.rt.returnSlice.time=Anytime&ar.rt.flexAirSearch=true&_ar.rt.flexAirSearch=0&ar.rt.numAdult=1&ar.rt.numSenior=0&ar.rt.numChild=0&ar.rt.child%5B0%5D=&ar.rt.child%5B1%5D=&ar.rt.child%5B2%5D=&ar.rt.child%5B3%5D=&ar.rt.child%5B4%5D=&ar.rt.child%5B5%5D=&ar.rt.child%5B6%5D=&ar.rt.child%5B7%5D=&_ar.rt.nonStop=0&_ar.rt.narrowSel=0&ar.rt.narrow=airlines&ar.rt.carriers%5B0%5D=&ar.rt.carriers%5B1%5D=&ar.rt.carriers%5B2%5D=&ar.rt.cabin=C&search=Search+Flights";
    }
}
