package src;

import java.util.ArrayList;
import java.util.List;

public class EventService {
    private List<Event> events = new ArrayList<>();
    private List<Registration> registrations = new ArrayList<>();

    public void addEvent(String name, String date, String venue) {
        if (name.isBlank() || date.isBlank() || venue.isBlank()) {
            System.out.println("All fields are required.");
            return;
        }
        events.add(new Event(name, date, venue));
        System.out.println("Event added.");
    }

    public void listEvents() {
        if (events.isEmpty()) {
            System.out.println("No events.");
        } else {
            for (Event event : events) {
                System.out.println(event);
            }
        }
    }

    public void register(int eventId, String studentName, String studentEmail) {
        for (Event event : events) {
            if (event.getId() == eventId && event.isActive()) {
                if (studentName.isBlank() || studentEmail.isBlank()) {
                    System.out.println("Student details required.");
                    return;
                }
                registrations.add(new Registration(eventId, studentName, studentEmail));
                System.out.println("Registered successfully.");
                return;
            }
        }
        System.out.println("Active event not found.");
    }

    public void listRegistrations() {
        if (registrations.isEmpty()) {
            System.out.println("No registrations.");
        } else {
            for (Registration reg : registrations) {
                System.out.println(reg);
            }
        }
    }

    public void cancel(int eventId) {
        for (Event event : events) {
            if (event.getId() == eventId) {
                event.cancel();
                System.out.println("Event cancelled.");
                return;
            }
        }
        System.out.println("Event not found.");
    }
}
