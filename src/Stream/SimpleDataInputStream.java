package Stream;

import java.io.*;

public class SimpleDataInputStream {
    public static void main(String[] args) {
        try (DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("dataOut.txt")));
             DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream("dataOut.txt")))){
        out.writeShort(1500);
        out.writeInt(1111);
        out.writeLong(10L);
        out.writeUTF("Hello world");
        out.flush();

            System.out.println(in.readShort());
            System.out.println(in.readInt());
            System.out.println(in.readLong());
            System.out.println(in.readUTF());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
