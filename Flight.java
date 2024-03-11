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


    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }


    public String getDestination() {
        return destination;
    }


    public void setDestination(String destination) {
        this.destination = destination;
    }


    public int getCapacity() {
        return capacity;
    }


    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }


    public ArrayList<String> getPassengers() {
        return passengers;
    }


    public void setPassengers(ArrayList<String> passengers) {
        this.passengers = passengers;
    }
    
}