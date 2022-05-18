import java.util.*;

public class treemap{
public static void main(String[] args) {
    TreeMap<Integer, String> values = new TreeMap<>();

    values.put(1,"Rolls Royals");
    values.put(2,"Mustang");
    values.put(3,"Ferrari");
    values.put(4,"BMW");
    values.put(5,"Audi");
    values.put(6,"Benz");

    System.out.println("TreeMap values: " + values);
    System.out.println("Values: " + values.values());
    System.out.println("Keys: " + values.keySet());
    System.out.println("TreeMap entries: " + values.entrySet());
    values.replace(5,"Lamborgani");
    System.out.println("After replacing: " + values);


    String removedValue = values.remove(3);
    System.out.println("After Removing: " + removedValue);

    System.out.println("New map: " + values);
}
}