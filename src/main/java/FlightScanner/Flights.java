package FlightScanner;

import java.util.HashSet;

public class Flights {

    private HashSet<Flight> possibleFlights = new HashSet<>();

    public HashSet<Flight> create() {
        possibleFlights.add(new Flight("Barcelona","Madryt"));
        possibleFlights.add(new Flight("Madryt", "Malaga"));
        possibleFlights.add(new Flight("Malaga", "Barcelona"));

        return possibleFlights;
    }

}
