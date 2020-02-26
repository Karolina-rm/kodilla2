package FlightScanner;

import java.util.HashSet;
import java.util.stream.Collectors;

public class FlightSearcher {

    private HashSet<Flight> possibleFlights;

    public FlightSearcher(HashSet<Flight> possibleFlights) {
        this.possibleFlights = possibleFlights;
    }

    public String findFlightToCity(String arrivalAirport) {
        return possibleFlights.stream()
                .filter(entry -> entry.getArrivalAirport().equals(arrivalAirport))
                .map(Flight::getDepartureAirport)
                .collect(Collectors.joining(",", "You can travel to: " + arrivalAirport + " from ", "."));
    }

    public String findFlightFromCity(String departureAirport) {
        return possibleFlights.stream()
                .filter(entry -> entry.getDepartureAirport().equals(departureAirport))
                .map(Flight::getArrivalAirport)
                .collect(Collectors.joining(",", "You can travel from: " + departureAirport + " to ",""));
    }

    public String findFlightVia(String change) {
        String airports = possibleFlights.stream()
                .filter(entry -> entry.getDepartureAirport().equals(change))
                .map(Flight::getArrivalAirport)
                .collect(Collectors.joining(", "));

        return possibleFlights.stream()
                .filter(entry -> entry.getArrivalAirport().equals(change))
                .map(Flight::getDepartureAirport)
                .collect(Collectors.joining(", ", "You can fly via " + change + " from ", " to "
                        + airports + "."));
    }



}
