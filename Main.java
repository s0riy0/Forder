import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TicketBookingSystem system = new TicketBookingSystem();
        Scanner scanner = new Scanner(System.in);

        // เพิ่มเที่ยวบินตัวอย่าง
        system.addFlight("AB123", "Bangkok", 5);
        system.addFlight("CD456", "Singapore", 3);
        system.addFlight("EF789", "Tokyo", 8);

        while (true) {
            System.out.println("\n--- Flight Booking System ---");
            System.out.println("1. Display Flights");
            System.out.println("2. Book a Ticket");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    system.displayFlights();
                    break;
                case 2:
                    System.out.print("Enter Flight Number: ");
                    String flightNumber = scanner.next();
                    system.bookTicket(flightNumber);
                    break;
                case 3:
                    System.out.println("Thank you for using the Flight Booking System!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
