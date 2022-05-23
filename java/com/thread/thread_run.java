import java.lang.*;

public class thread_run implements Runnable{
    public static void main(String[] args) {
<<<<<<< HEAD
        Thread s1 = new Thread(new thread_run());
        System.out.println(Thread.currentThread().getName());
        System.out.println("Main function");
        s1.run(); 
        System.out.println("Venkata krishnan");
=======
        thread_run s1 = new thread_run(new RunnableThread());
        System.out.println(Thread.currentThread().getName());
        System.out.println("Main function");
        s1.start();
>>>>>>> 9dc9f19ca4dfb745ae3cd1e2fddc12a8b0fb84e3
    }   
    public void run(){
        System.out.println("I am Runnable thread");
        System.out.println(Thread.currentThread().getName());
    }
}
<<<<<<< HEAD


=======
>>>>>>> 9dc9f19ca4dfb745ae3cd1e2fddc12a8b0fb84e3
