public class thread extends Thread {
    public static void main(String[] args) {
        thread t1 = new thread();
        System.out.println(Thread.currentThread().getName());
        System.out.println("Main function");
        // t1.start();
        System.out.println(t1.isAlive());
    }
    public void run () {
        System.out.println("I am First thread");
        System.out.println("I am  Second thread");
        System.out.println(Thread.currentThread().getName());

        }  

}
