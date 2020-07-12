import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class FileIODemo {

    public static void main(String[] args) throws IOException {
        File f = new File("/Users/nicole/tmp/text.txt");
        if (!f.exists()) {
            OutputStream fo = new FileOutputStream(f);
            OutputStreamWriter fw = new OutputStreamWriter(fo);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String str;
            System.out.println("Enter 'q' to quit.");
            str = br.readLine();

            while (!str.equals("q")) {
                fw.append(str);
                fw.append("\r\n");
                str = br.readLine();
            }
            fw.close();
            fo.close();

        } else {
            InputStream fi = new FileInputStream(f);
            InputStreamReader fr = new InputStreamReader(fi);
            StringBuffer sb = new StringBuffer();
            while (fr.ready()) {
                sb.append((char) fr.read());
            }
            System.out.println(sb.toString());
            fr.close();
            fi.close();
        }
    }
}
