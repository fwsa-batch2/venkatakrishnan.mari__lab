import java.io.*;
public class io_newFile {
    public static void main(String[] args) throws IOException {
        File file = new File("\\home\\venkatakrishnanmari\\java\\com\\io\\newFile.txt");
        if(file.createNewFile()){
            System.out.println("File created");
        }
        else{
            System.out.println("File exists");
        }
    }
    
}
