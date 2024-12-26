import java.util.ArrayList;
import java.util.Scanner;

public class TicketBookingSystem {
    private ArrayList<Flight> flights;

    public TicketBookingSystem() {
        flights = new ArrayList<>();
    }

    public void addFlight(String flightNumber, String destination, int totalSeats) {
        flights.add(new Flight(flightNumber, destination, totalSeats));
    }

    public void displayFlights() {
        System.out.println("Available Flights:");
        for (Flight flight : flights) {
            System.out.println(flight);
        }
    }

    public Flight findFlight(String flightNumber) {
        for (Flight flight : flights) {
            if (flight.getFlightNumber().equalsIgnoreCase(flightNumber)) {
                return flight;
            }
        }
        return null;
    }

    public void bookTicket(String flightNumber) {
        Flight flight = findFlight(flightNumber);
        if (flight == null) {
            System.out.println("Flight not found!");
            return;
        }

        if (flight.bookSeat()) {
            System.out.println("Booking successful! Remaining seats: " + flight.getAvailableSeats());
        } else {
            System.out.println("No seats available for this flight.");
        }
    }
}
