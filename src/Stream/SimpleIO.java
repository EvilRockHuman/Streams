package Stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class SimpleIO {
    public static void main(String[] args) throws Exception {
        InputStream is = null;
        try (OutputStream os = new FileOutputStream("test.txt")) {
            byte[] bWrite = {11, 21, 3, 40, 56, 77, 1};
            for (byte bb : bWrite) {
                os.write(bb);
            }
            os.flush();

            is = new FileInputStream("test.txt");
            int size = is.available();
            for (int i = 0; i < size; i++) {
                System.out.println((char) is.read() + " ");
            }
        } catch (Exception e) {
            System.err.println("Exception");
        } finally {
            if(is != null){
                is.close();
            }
        }
    }
}
