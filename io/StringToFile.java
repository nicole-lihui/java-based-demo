import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

/**
 * StringToFile
 */
public class StringToFile {

    public static void main(String[] args) {
        Path fpath = Paths.get("/Users/nicole/Documents/demo/Java/io/bb.txt");

        try {
            Files.writeString(fpath, "Hello World !!\nbbbb\bdjkbfdjks\nddddd\n", StandardOpenOption.APPEND);

            String content = Files.readString(fpath);
    
            System.out.println(content);

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
 
}
