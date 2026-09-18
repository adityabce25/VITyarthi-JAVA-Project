package src;
import java.util.*;
public class EventService { private List<Event> events=new ArrayList<>(); private List<Registration> registrations=new ArrayList<>();
 public void addEvent(String n,String d,String v){if(n.isBlank()||d.isBlank()||v.isBlank()){System.out.println("All fields are required.");return;} events.add(new Event(n,d,v));System.out.println("Event added.");}
 public void listEvents(){if(events.isEmpty())System.out.println("No events.");else events.forEach(System.out::println);}
 public void register(int id,String s,String e){for(Event x:events)if(x.getId()==id&&x.isActive()){if(s.isBlank()||e.isBlank()){System.out.println("Student details required.");return;}registrations.add(new Registration(id,s,e));System.out.println("Registered successfully.");return;}System.out.println("Active event not found.");}
 public void listRegistrations(){if(registrations.isEmpty())System.out.println("No registrations.");else registrations.forEach(System.out::println);}
 public void cancel(int id){for(Event x:events)if(x.getId()==id){x.cancel();System.out.println("Event cancelled.");return;}System.out.println("Event not found.");}}
