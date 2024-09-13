
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

import java.io.IOException;

public class PrintingASpecifiedFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which file should have its contents printed ?");
        String fileName = scanner.nextLine();
        try (Scanner scanner2 = new Scanner(Paths.get(String.valueOf(fileName)))) {
            while (scanner2.hasNextLine()) {
                System.out.println(scanner2.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}
