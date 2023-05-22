import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        File source = new File("C:\\Users\\coral\\Desktop\\index.html");
        File destination = new File("C:\\Users\\coral\\Desktop\\dossier1\\" + source.getName());

        try {
            Files.copy(source.toPath(), destination.toPath(), StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        source.delete();

    }
}
