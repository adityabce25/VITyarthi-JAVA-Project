package src;

public class Event {
    private static int nextId = 1;
    private int id;
    private String name;
    private String date;
    private String venue;
    private boolean active = true;

    public Event(String name, String date, String venue) {
        this.id = nextId++;
        this.name = name;
        this.date = date;
        this.venue = venue;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getDate() { return date; }
    public String getVenue() { return venue; }
    public boolean isActive() { return active; }

    public void cancel() {
        this.active = false;
    }

    @Override
    public String toString() {
        String status = active ? "ACTIVE" : "CANCELLED";
        return id + " | " + name + " | " + date + " | " + venue + " | " + status;
    }
}
