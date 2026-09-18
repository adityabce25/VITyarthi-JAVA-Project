package src;
import java.util.*;
public class Main {
 public static void main(String[] args){ Scanner sc=new Scanner(System.in); EventService service=new EventService(); int c;
  do{System.out.println("\n=== CAMPUS EVENT MANAGER ===\n1.Add Event 2.List Events 3.Register Student 4.List Registrations 5.Cancel Event 0.Exit"); c=readInt(sc);
   switch(c){case 1: System.out.print("Event name: "); String n=sc.nextLine(); System.out.print("Date (dd-mm-yyyy): "); String d=sc.nextLine(); System.out.print("Venue: "); String v=sc.nextLine(); service.addEvent(n,d,v); break;
   case 2: service.listEvents(); break; case 3: System.out.print("Event ID: "); int id=readInt(sc); System.out.print("Student name: "); String s=sc.nextLine(); System.out.print("Student email: "); String e=sc.nextLine(); service.register(id,s,e); break;
   case 4: service.listRegistrations(); break; case 5: System.out.print("Event ID: "); service.cancel(readInt(sc)); break; case 0: System.out.println("Goodbye!"); break; default:System.out.println("Invalid choice");}}
  while(c!=0); sc.close(); }
 static int readInt(Scanner sc){while(true)try{return Integer.parseInt(sc.nextLine());}catch(Exception e){System.out.print("Enter a number: ");}}
}
