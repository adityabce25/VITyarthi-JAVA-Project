package src;

public class Registration {
    private int eventId;
    private String studentName;
    private String email;

    public Registration(int eventId, String studentName, String email) {
        this.eventId = eventId;
        this.studentName = studentName;
        this.email = email;
    }

    public int getEventId() {
        return eventId;
    }

    @Override
    public String toString() {
        return eventId + " | " + studentName + " | " + email;
    }
}
