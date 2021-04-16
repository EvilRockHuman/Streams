package Stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class errStream {
    public static void main(String[] args) {
        try {
            InputStream inputStream = new FileInputStream("D:");
            System.out.println("File opened");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.err.println("fuck");
        }
    }
}
