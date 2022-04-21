import java.util.ArrayList;
import java.util.Comparator;

public class Array {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("BMW");
        cars.add("Benz");
        cars.add("Audi");
        cars.add("Mustang");
        cars.add("Jeep");

        // System.out.println(cars);
       
        // int size = cars.size();
        cars.sort(Comparator.reverseOrder());
        System.out.println(cars);
        // System.out.println("Size of the cars: "+ size);

        
        // System.out.println("Cloning cars: " + cars.clone());

        // ArrayList<String> cars1 = new ArrayList<String>();
        // cars1.add("Suzuki");
        // cars1.add("Kia");
        // cars1.add("Honda");
        // cars1.add("Toyato");
        // cars1.add("Hector");
        // System.out.println(cars1);

        // cars1.addAll(1, cars);
        // System.out.println("CarList: " + cars1);


        
    }
}
