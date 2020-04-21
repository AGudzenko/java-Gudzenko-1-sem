import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FastReader {
    public static void main(String[] args) throws Exception {
        fastReadFile("out3.txt");
    }

    private static void fastReadFile(String fileName) throws Exception {

        Path file_a = Paths.get(fileName);
        try (Scanner in = new Scanner(file_a)) {
            while (in.hasNext()) {
                String word = in.next();
                System.out.print(word + "\r");
                System.out.flush();

                if (word.charAt(word.length() - 1) == '!' || word.charAt(word.length() - 1) == '.' || word.charAt(word.length() - 1) == '?' || word.charAt(word.length() - 1) == ',') {
                    Thread.sleep(4000);
                } else {
                    Thread.sleep(1000);
                }

            }

        }
    }
}
