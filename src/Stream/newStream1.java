package Stream;

import java.io.*;

public class newStream1 {
    public static void main(String[] args) throws Exception{
        File f1 = new File("C:\\Users\\Матвей СНиИ\\Desktop\\Новая папка (2)\\lambda\\src\\Stream\\Hello");
        BufferedReader bf = new BufferedReader(new FileReader(f1));
        String temp;
        while ((temp = bf.readLine()) !=null){
            System.out.println(temp);
        }
        bf.close();
        PrintWriter pw = new PrintWriter(new FileWriter(f1,true));
        pw.println("gg");
        pw.flush();
        pw.close();
    }
}
