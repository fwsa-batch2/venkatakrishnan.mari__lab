public class GarbageCollector {

    GarbageCollector gcd;

    public static void main(String[] args) {
        GarbageCollector obj1 = new GarbageCollector();
        GarbageCollector obj2 = new GarbageCollector();
        GarbageCollector obj3 = new GarbageCollector();


           obj1 = null; 
           obj2 = null;
           obj3 = null;
        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);
        System.out.println(obj1.gcd);
    }
}
