package src;
public class Registration { private int eventId; private String student,email; public Registration(int id,String s,String e){eventId=id;student=s;email=e;} public int getEventId(){return eventId;} public String toString(){return eventId+" | "+student+" | "+email;}}
