
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        while (true) {
            String text = scanner.nextLine();
            if (text.equals("")) {
                break;
            }
            String[] words = text.split(" ");
            for (int i = 0; i < words.length; i++) {
                System.out.println(words[i]);
            }

        }
    }
}
