import java.util.ArrayList;

class Main {
    public static void main(String[] args) {

        FlightDatabase database = new FlightDatabase ();
        database.checkFlightExists("Paris", "Madrid",200);
        database.displayFlightsFromCity("Paris");
        database.displayFlightsToCity("Warsaw");
        ArrayList<String> cities= database.getCities();
        System.out.println(cities);

    }
}
