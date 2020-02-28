package FlightScanner;

public class App {

    public static void main (String[] args) {

        Flights flights = new Flights();
        FlightSearcher flightSearcher = new FlightSearcher(flights.create());

        System.out.println(flightSearcher.findFlightFromCity("Madryt"));
        System.out.println(flightSearcher.findFlightToCity("Barcelona"));
        System.out.println(flightSearcher.findFlightVia("Barcelona"));
    }

}
