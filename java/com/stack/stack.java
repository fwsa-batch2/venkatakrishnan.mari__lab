import java.util.Stack;
public class stack {
    public static void main(String[] args) {
        Stack<Integer> number = new Stack<>();

        number.push(1);
        number.push(2);
        number.push(3);
        number.push(4);
        number.push(5);

        // Stack work in LIFO principle (Last In First Out)
        System.out.println("Adding elements: " + number);
        number.pop();
        System.out.println("After delete elements: " + number);




    }
    
}
