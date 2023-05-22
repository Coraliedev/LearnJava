import java.io.*;
import java.nio.charset.StandardCharsets;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        File folder = new File("C:\\Users\\coral\\Desktop\\dossier1");

        File file = new File("C:\\Users\\coral\\Desktop\\index.html");

        if (!folder.exists()) {
            boolean mkdir = folder.mkdir();
        }

        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            FileWriter writer;
            try {
                writer = new FileWriter(file);
                BufferedWriter bw = new BufferedWriter(writer);
                bw.write("""
                        <!DOCTYPE html>
                        <html lang="fr">
                        <head>
                            <meta charset="UTF-8">
                            <title>Document</title>
                        </head>
                        <body>
                            <h1>Index</h1>
                            </body>
                        </html>
                            
                        """);
                bw.close();
                BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8));
                String line = reader.readLine();
                while (line != null) {
                    System.out.println(line);
                    line = reader.readLine();
                }
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
