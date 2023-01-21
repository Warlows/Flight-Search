import java.util.ArrayList;

public class FlightDatabase {
    ArrayList<Flight> flights = new ArrayList<Flight>();

    public FlightDatabase() {
        this.flights.add(new Flight("Berlin", "Tokyo", 1800));
        this.flights.add(new Flight("Paris", "Berlin", 79));
        this.flights.add(new Flight("Warsaw", "Paris", 130));
        this.flights.add(new Flight("Madrid", "Berlin", 64));
        this.flights.add(new Flight("Berlin", "Warsaw", 87));
        this.flights.add(new Flight("Paris", "Madrid", 200));
        this.flights.add(new Flight("Porto", "Warsaw", 250));
        this.flights.add(new Flight("Madrid", "Porto", 250));
        this.flights.add(new Flight("Warsaw", "Madrid", 123));

    }

    public void checkFlightExists(String start, String end, int ticket) {
        boolean notExists = true;
        for (int i = 0; i < this.flights.size(); i++) {
            Flight flight = this.flights.get(i);
            if (start.equals(flight.departure) &&
                    end.equals(flight.arrival)) {
                System.out.println("Flight exists");
                return;
            }
        }
        System.out.println("Flight whit given paramas not exists");

    }

    public void displayFlights(ArrayList<Flight> result) {
        if (result.isEmpty()) {
            System.out.println("Flight not Found");
        }
        for (int i = 0; i < result.size(); i++) {
            Flight flight = result.get(i);
            System.out.println(flight.getDetails());
        }
    }

    public ArrayList<Flight> getFlightsFromCity(String city) {
        ArrayList<Flight> results = new ArrayList<>();
        for (int i = 0; i < this.flights.size(); i++) {
            Flight flight = this.flights.get(i);
            if (city.equals(flight.departure)) {
                results.add(flight);
            }
        }
        return results;
    }

    public ArrayList<Flight> getFlightsToCity(String city) {
        ArrayList<Flight> results = new ArrayList<>();
        for (int i = 0; i < this.flights.size(); i++) {
            Flight flight = this.flights.get(i);
            if (city.equals(flight.arrival)) {
                results.add(flight);
            }
        }
        return results;
    }

    public void displayFlightsFromCity(String city) {
        ArrayList<Flight> results = getFlightsFromCity(city);
        displayFlights(results);
    }

    public void displayFlightsToCity(String city) {
        ArrayList<Flight> results = getFlightsToCity(city);
        displayFlights(results);
    }

    public ArrayList<String> getCities() {
        ArrayList<String> cities = new ArrayList<>();
        for (int i = 0; i < this.flights.size(); i++) {
            Flight flight = this.flights.get(i);
            if (!cities.contains(flight.departure)) {
                cities.add(flight.departure);
            }
            if (!cities.contains(flight.arrival)) {
                cities.add(flight.arrival);
            }
        }
        return cities;
    }

    public void getCheapetsFlight() {
        Flight cheapetsFlight = null;
        for (int i = 0; i < this.flights.size(); i++) {
        }
        return;
    }
}




