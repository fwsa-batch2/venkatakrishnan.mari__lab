import java.io.*;
public class io_delete {
    public static void main(String[] args) {
        
        File file = new File("\\home\\venkatakrishnanmari\\java\\com\\io\\newFile.txt");

        if(file.delete()){
            System.out.println("Successfully deleted");
        }
        else{
            System.out.println("Operation failed");
        }
    }
}
