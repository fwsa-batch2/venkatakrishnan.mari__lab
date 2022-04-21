public class Method_over {
    static int add(int x , int y){
        return x+y;
    }
    static double add(double a, double b){
        return a-b;
    }
    public static void main(String[] args) {
        int myNum = add(2,3);
        double myNum1 = add(4.5, 2.4);
        System.out.println(myNum);
        System.out.println(myNum1);
        
    }
}
