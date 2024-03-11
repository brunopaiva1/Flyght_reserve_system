import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FlightReservationSystem reservationSystem = new FlightReservationSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nBem-vindo ao Sistema de Reserva de Passagens Aéreas");
            reservationSystem.displayFlights();

            System.out.print("\nEscolha um voo (ou 'q' para sair): ");
            String choice = scanner.nextLine();
            if (choice.toLowerCase().equals("q")) {
                break;
            }

            try {
                int flightNumber = Integer.parseInt(choice);
                if (flightNumber >= 1 && flightNumber <= reservationSystem.getNumberOfFlights()) {
                    Flight selectedFlight = reservationSystem.getFlight(flightNumber - 1);

                    selectedFlight.displayDetails();

                    System.out.print("Digite seu nome: ");
                    String passengerName = scanner.nextLine();
                    selectedFlight.bookSeat(passengerName);
                } else {
                    System.out.println("Escolha inválida. Por favor, digite o número do voo.");
                }
            } catch (NumberFormatException | IndexOutOfBoundsException e) {
                System.out.println("Escolha inválida. Por favor, digite o número do voo.");
            }
        }
        scanner.close();
    }
}
