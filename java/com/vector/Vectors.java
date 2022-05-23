import java.util.*;
public class Vectors {
    public static void main(String[] args) {
        Vector<Integer> vec = new Vector<>();

        for(int i=1;i<=5;i++){
            vec.add(i);

        }
        System.out.println(vec);
        vec.remove(2);
        System.out.println(vec);

        for(int a=0;a<vec.size();a++){
                 System.out.print(vec.get(a) + " ");

        }
    }
}

// Vector is Synchronized
// ArrayList is non-Synchronized
