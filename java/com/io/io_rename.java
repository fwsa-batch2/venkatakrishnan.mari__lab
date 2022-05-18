import java.io.*;
public class io_rename {
    public static void main(String[] args)throws IOException {
        File file = new File("\\home\\venki.txt");
        File name = new File("\\home\\venky.txt");

        boolean reFile = file.renameTo(name);
        if(reFile == true){
            System.out.println("Successfully renamed");
        }
        else{
            System.out.println("Operation failed");
        }
        System.out.println("Renamed name: " + name);
    }
}
