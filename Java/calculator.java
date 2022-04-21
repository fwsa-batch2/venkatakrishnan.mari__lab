public class calculator {
    static int add(int x, int y){
        return x+y;
    }
    static int sub(int x, int y){
        return x-y;

    }
    static int mul(int x, int y){
        return x*y;

    }
    static int div(int x, int y){
        return x\y;

    }
    public static void main(String[] args) {
        int myNum1 = add(20,30);
        int myNum2 = sub(20,30);
        int myNum3 = mul(20,30);
        int myNum4 = div(30,2);

        System.out.println("Adding two numbers: "+ myNum1);
        System.out.println("Subtract two numbers: "+ myNum2);
        System.out.println("Multiply two numbers: "+ myNum3);
        System.out.println("Divide two numbers: "+ myNum4);



    }
}
