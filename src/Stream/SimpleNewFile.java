package Stream;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class SimpleNewFile {
    public static void main(String[] args) {
        File sourceFile = new File("C:\\Users\\Матвей СНиИ\\Desktop\\Новая папка (2)\\lambda\\src\\Stream\\sourceFile.txt");
        File targetFile = new File("C:\\Users\\Матвей СНиИ\\Desktop\\Новая папка (2)\\lambda\\src\\Stream\\targetFile.txt");
        try {
            Files.copy(sourceFile.toPath(), targetFile.toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
