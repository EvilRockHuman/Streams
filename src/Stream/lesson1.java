package Stream;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class lesson1{
/**
 * Написать метод, который сохраняет лист строк в
 * файл.boolean write(List<String> strings, String filename)
 * Если произойдёт исключение вернутьfalse, иначеtrue
 */
public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("Main");
    list.add("to");
    list.add("Make");
    try {
        DataOutputStream out = new DataOutputStream(new FileOutputStream("code.txt"));
        for (String strings:list) {

        }
    } catch (IOException e) {
        e.printStackTrace();
    }
}
}
