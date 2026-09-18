package src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EventService service = new EventService();
        int choice;

        do {
            System.out.println("\n=== CAMPUS EVENT MANAGER ===");
            System.out.println("1. Add Event");
            System.out.println("2. List Events");
            System.out.println("3. Register Student");
            System.out.println("4. List Registrations");
            System.out.println("5. Cancel Event");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = readInt(scanner);

            switch (choice) {
                case 1:
                    System.out.print("Event name: ");
                    String name = scanner.nextLine();
                    System.out.print("Date (dd-mm-yyyy): ");
                    String date = scanner.nextLine();
                    System.out.print("Venue: ");
                    String venue = scanner.nextLine();
                    service.addEvent(name, date, venue);
                    break;
                case 2:
                    service.listEvents();
                    break;
                case 3:
                    System.out.print("Event ID: ");
                    int id = readInt(scanner);
                    System.out.print("Student name: ");
                    String studentName = scanner.nextLine();
                    System.out.print("Student email: ");
                    String email = scanner.nextLine();
                    service.register(id, studentName, email);
                    break;
                case 4:
                    service.listRegistrations();
                    break;
                case 5:
                    System.out.print("Event ID: ");
                    int cancelId = readInt(scanner);
                    service.cancel(cancelId);
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 0);
        
        scanner.close();
    }

    static int readInt(Scanner scanner) {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.print("Enter a number: ");
            }
        }
    }
}
