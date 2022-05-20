import java.io.*;
public class io_write {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("\\home\\venki.txt");
        
            fileWriter.write("hello venki "); 
            fileWriter.close();    
            System.out.println("Written in the page");
    }
}
    

