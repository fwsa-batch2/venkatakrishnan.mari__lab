import java.util.*;

public class Wrapper_char {
    public static void main(String[] args) {
        char myChar = 'V';
        Character obj1 = Character.valueOf(myChar);
        Character obj2 = myChar;

        System.out.println("Primitive to Object: " + obj1);
        System.out.println("Primitive to Object: " + obj2);


        Character type = 'M';
        char Character1 = type.charValue();
        char Character2 = type;

        System.out.println("Object to primitive: " + Character1);
        System.out.println("Object to primitive: " + Character2);

    }
    
}
