
import java.util.HashMap;
public class mapping {
    public static void main(String[] args) {
       HashMap<Integer, String> al  = new HashMap<>();
        al.put(1,"Venkat");
        al.put(2,"Krishnan");
        al.put(3,"Venkat");
        al.put(4,"Mari");
        al.put(null,"Venky");
        al.put(null, "Krish");

        System.out.println("Maps: " + al);

        System.out.println("Keys: " + al.keySet());

        System.out.println("Values: " + al.values());

        System.out.println("Entries: " + al.entrySet());

        String del = al.remove(3);
        System.out.println("Remove value: " + del);
        System.out.println("Entries: " + al.entrySet());

    }

    
}


