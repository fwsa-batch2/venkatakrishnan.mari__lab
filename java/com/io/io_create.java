import java.io.*;
public class io_create {
    public static void main(String[] args) throws IOException {
        File file = new File("\\home\\venki.txt");
        if(file.createNewFile()){
            System.out.println("File created");
        }
        else{
            System.out.println("File exists");
        }
    }
    
}
