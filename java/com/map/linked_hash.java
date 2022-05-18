import java.util.LinkedHashMap;

public class linked_hash {
    public static void main(String[] args) {
        LinkedHashMap<String, String> map1 = new LinkedHashMap<>();

        map1.put("One", "Vijay");
        map1.put("Two", "Dhanush");
        map1.put("Three", "Ajith");
        map1.put("Four", "Surya");
        map1.put("Five", "SK");
        map1.put(null, "Vikram");
        map1.put("Six", null);
        map1.put("Seven", null);



        System.out.println("LinkedMaps: " + map1);
        System.out.println("Keys: " + map1.keySet());
        System.out.println("Values: " + map1.values());
        System.out.println("Entries: " + map1.entrySet());

        String del = map1.remove(null);
        System.out.println("Removed values: " + del);
        System.out.println("Entries: " + map1.entrySet());
    }
}
