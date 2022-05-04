public class Wrapper {
    

    public static void main(String[] args) {

        char a = 'w';
        int num1 = 10;

        Integer bs = Integer.valueOf(num1);
        // Character obj = Character.valueOf(a); // boxing
        Character obj1 = a; // auto boxing 

       
        System.out.println(obj1); 
        System.out.println(bs); 




        
        Character ws = new Character(obj1);
        char vs = ws;
        System.out.println(vs);

        Integer num = new Integer(bs); 
        int number = num;
        System.out.println(number);


        

    }
}
