// openjml --esc $@
import java.util.ArrayList;
class Flight {
    public String flightNumber;
    public String destination;
    public int capacity;
    public ArrayList<String> passengers;

    public Flight(String flightNumber, String destination, int capacity) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<>();
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public int getCapacity() {
        return capacity;
    }

    public int availableSeats() {
        return capacity - passengers.size();
    }

    public boolean isSeatAvailable() {
        return availableSeats() > 0;
    }

    public boolean hasPassenger(String passengerName) {
        return passengers.contains(passengerName);
    }

    public boolean bookSeat(String passengerName) {
        if (isSeatAvailable()) {
            passengers.add(passengerName);                    
            System.out.println("Reserva confirmada para " + passengerName + " no voo " + flightNumber + ".");
            return true;
        } else {
            System.out.println("Desculpe, não há assentos disponíveis no voo " + flightNumber + ".");
                return false;
        }
    }

    public void cancelSeat(String passengerName) {
        if (hasPassenger(passengerName)) {
            passengers.remove(passengerName);
            System.out.println("Reserva cancelada para " + passengerName + " no voo " + flightNumber + ".");
        } else {
            System.out.println("Passageiro " + passengerName + " não encontrado no voo " + flightNumber + ".");
        }
    }

    public void displayDetails() {
        System.out.println("Detalhes do Voo " + flightNumber + ":");
        System.out.println("Destino: " + destination);
        System.out.println("Assentos disponíveis: " + availableSeats());
        System.out.println("Lista de Passageiros: " + passengers);
    }
}