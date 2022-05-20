import java.lang.*;

public class thread_run implements Runnable{
    public static void main(String[] args) {
        thread_run s1 = new thread_run(new RunnableThread());
        System.out.println(Thread.currentThread().getName());
        System.out.println("Main function");
        s1.start();
    }   
    public void run(){
        System.out.println("I am Runnable thread");
        System.out.println(Thread.currentThread().getName());
    }
}
