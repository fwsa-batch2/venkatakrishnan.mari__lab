import java.util.*;

public class ArrList{
    public static void main(String[] args) {
       
        ArrayList<Integer> al = new ArrayList<Integer>();

        for(int a=1;a<=7;a++){
            al.add(a);
            
        }
        System.out.println(al);

        al.remove(4);
        System.out.println(al);

        for(int i=0;i<al.size();i++){
            System.out.print(al.get(i));

        }
    }
}