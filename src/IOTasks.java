import java.io.PrintStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class IOTasks {
    public static void main(String[] args) throws Exception {
        String[] lines = new String[]{"молодец", "Алина", "Так держать"};

        //System.out.println(sumToFile("a1.txt"));
        //writeToFile("a2.txt", lines);
        fix_File("out3.txt", "in3.txt");


    }

    private static int sumToFile(String fileName) throws Exception {

        int sum = 0;
        Path file_a = Paths.get(fileName);
        try (Scanner in = new Scanner(file_a)) {
            while (in.hasNext()) {
                if (in.hasNextInt()) {
                    int a = in.nextInt();
                    sum += a;
                } else {
                    in.next();
                }

            }

        }
        return sum;
    }

    private static void writeToFile(String fileName, String[] lines) throws Exception {

        try (PrintStream out = new PrintStream(fileName, "utf8")) {
            for (String x : lines) {
                out.println(x);
            }

        }

    }

    private static void fix_File(String outfileName, String infileName) throws Exception {
        boolean register = true;
        String rez_str = "";
        Path file_a = Paths.get(outfileName);
        try (Scanner in = new Scanner(file_a)) {
            while (in.hasNext()) {
                String word = in.next().toLowerCase();
                if (register) {
                    rez_str += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
                    register = false;
                    if (word.charAt(word.length() - 1) == '!' || word.charAt(word.length() - 1) == '.' || word.charAt(word.length() - 1) == '?') {
                        register = true;
                    }
                } else {
                    rez_str += word + " ";
                    if (word.charAt(word.length() - 1) == '!' || word.charAt(word.length() - 1) == '.' || word.charAt(word.length() - 1) == '?') {
                        register = true;
                    }
                }

            }

        }
        try (PrintStream out = new PrintStream(infileName, "utf8")) {
            out.println(rez_str);

        }

    }
}