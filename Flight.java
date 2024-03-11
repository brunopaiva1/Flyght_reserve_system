import java.util.Scanner;
import java.util.ArrayList;

class Flight{
    private String flightNumber;
    private String destination;
    private int capacity;
    private ArrayList<String> passengers;

    //@ invariant passengers != null;
    //@ invariant capacity >= 0;
    //@ invariant passengers.size() <= capacity;


    public Flight(String flightNumber, String destination, int capacity, ArrayList<String> passengers) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = passengers;
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

    public ArrayList<String> getPassengers() {
        return passengers;
    }

    public int availableSeats() {
        return capacity - passengers.size();
    }

    public void bookSeat(String passengerName) {
        if (availableSeats() > 0) {
            passengers.add(passengerName);
            System.out.println("Reserva confirmada para " + passengerName + " no voo " + flightNumber + ".");
        } else {
            System.out.println("Desculpe, não há assentos disponíveis no voo " + flightNumber + ".");
        }
    }

    public void displayDetails() {
        System.out.println("Detalhes do Voo " + flightNumber + ":");
        System.out.println("Destino: " + destination);
        System.out.println("Assentos disponíveis: " + availableSeats());
        System.out.println("Lista de Passageiros: " + passengers);
    }
}