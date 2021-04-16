package Stream;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class IO_Stream {
    public static void main(String[] args) throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in,"cp866"));
                PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out,"UTF-8"), true)){
            String s = "Hello World";
            System.out.println(s);
            pw.println(s);
            char c;
            pw.println("Symbol enter: ");
            while ((c=(char)br.read()) != 'q'){
                pw.println(c);
            }
            pw.println("line enter: ");
            do{
                s=br.readLine();
                pw.println(s);

            } while (!s.equals("q"));
        } catch (Exception e){
            System.out.println("game over");
        }
    }
}
