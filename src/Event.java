package src;
public class Event { private static int nextId=1; private int id; private String name,date,venue; private boolean active=true;
 public Event(String n,String d,String v){id=nextId++;name=n;date=d;venue=v;} public int getId(){return id;} public String getName(){return name;} public String getDate(){return date;} public String getVenue(){return venue;} public boolean isActive(){return active;} public void cancel(){active=false;}
 public String toString(){return id+" | "+name+" | "+date+" | "+venue+" | "+(active?"ACTIVE":"CANCELLED");}}
