package Stream;

import java.io.ByteArrayInputStream;

public class SimpleByteArrayInputStream {
    public static void main(String[] args) {
        byte[] arr = new byte[]{1, 3, 5, 7};
        ByteArrayInputStream bi = new ByteArrayInputStream(arr);
        int temp;
        while ((temp = bi.read()) != -1) {
            System.out.println(temp);
        }
        String str = "Hello";
        byte[] str2 = str.getBytes();
        ByteArrayInputStream bi2 = new ByteArrayInputStream(str2, 3, 2);
        int temp2;
        while((temp2 = bi2.read()) !=-1){
            System.out.println((char)temp2);
        }
    }
}
