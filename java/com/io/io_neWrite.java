import java.io.*;
public class io_neWrite {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("\\home\\venkatakrishnanmari\\java\\com\\io\\newFile.txt");
        
            fileWriter.write("This is the new file");
            fileWriter.close();    
            System.out.println("Written in the page");
    }
    
}
