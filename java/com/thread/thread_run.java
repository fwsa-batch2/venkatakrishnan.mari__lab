import java.lang.*;

public class thread_run implements Runnable{
    public static void main(String[] args) {
        Thread s1 = new Thread(new thread_run());
        System.out.println(Thread.currentThread().getName());
        System.out.println("Main function");
        s1.run(); 
        System.out.println("Venkata krishnan");
    }   
    public void run(){
        System.out.println("I am Runnable thread");
        System.out.println(Thread.currentThread().getName());
    }
}


