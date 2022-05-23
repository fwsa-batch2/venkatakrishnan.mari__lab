import java.lang.*;
public class GarbageCollector {
    public static void main(String args[]){  
     GarbageCollector s1= new GarbageCollector(); 
     GarbageCollector s2= new GarbageCollector();

     s1 = s2;
     System.gc();
     System.out.println("Garbage is Collected");
    
}

}
