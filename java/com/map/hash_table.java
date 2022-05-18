
import java.util.Hashtable;

public class hash_table {
    public static void main(String[] args) {
        Hashtable<Integer, String> vk = new Hashtable<>();
        
        vk.put(1, "Venky");
        vk.put(2, "Venkat");
        vk.put(3, "Mari");
        vk.put(4, "Krishna");
        vk.put(5, "Vijay");
        vk.put(6, "Krish");

        System.out.println("HashTable: " + vk);
    }
}
