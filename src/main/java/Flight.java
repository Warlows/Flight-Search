public class Flight {
    String departure;
    String arrival;
    int ticketPrice;

    public Flight(String departure, String arrival, int ticketPrice) {
        this.departure = departure;
        this.arrival = arrival;
        this.ticketPrice = ticketPrice;
    }


    public String getDetails() {

        return "Flight from " + this.departure + " to " + this.arrival + " Ticket price "  + this.ticketPrice;
    }


    }



