import java.util.ArrayList;

class FlightReservationSystem {
    private ArrayList<Flight> flights;

    public FlightReservationSystem() {
        this.flights = new ArrayList<>();
        flights.add(new Flight("AA123", "Nova York", 100));
        flights.add(new Flight("BB456", "Los Angeles", 150));
        flights.add(new Flight("CC789", "Chicago", 120));
    }
    //@ ensures \result.equals("Voos disponíveis:");
    public void displayFlights() {
        System.out.println("Voos disponíveis:");
        for (int i = 0; i < flights.size(); i++) {
            Flight flight = flights.get(i);
            System.out.println((i + 1) + ". Voo " + flight.getFlightNumber() + ": Destino - " + flight.getDestination() +
                    ", Assentos disponíveis - " + flight.availableSeats());
        }
    }

    public Flight getFlight(int index) {
        return flights.get(index);
    }

    public int getNumberOfFlights() {
        return flights.size();
    }

    public void cancelReservation(int flightIndex, String passengerName) {
        if (flightIndex >= 0 && flightIndex < flights.size()) {
            Flight flight = flights.get(flightIndex);
            flight.cancelSeat(passengerName);
        } else {
            System.out.println("Voo selecionado inválido.");
        }
    }
}