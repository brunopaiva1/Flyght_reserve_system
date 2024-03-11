import java.util.Scanner;
import java.util.ArrayList;

class Flight{
    private String flightNumber;
    private String destination;
    private int capacity;
    private ArrayList<String> passengers;


    public Flight(String flightNumber, String destination, int capacity, ArrayList<String> passengers) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = passengers;
    }
}