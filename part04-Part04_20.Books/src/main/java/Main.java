import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Book> booksList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Title:");
            String bookTitle = scanner.nextLine();
            if (bookTitle.isEmpty()) {
                break;
            }
            System.out.println("Pages:");
            int pages = Integer.valueOf(scanner.nextLine());
            System.out.println("Publication year:");
            int publicationYear = Integer.valueOf(scanner.nextLine());
            booksList.add(new Book(bookTitle, pages, publicationYear));
        }
        System.out.println("What information will be printed ?");
        String answer = scanner.nextLine();

        for (Book book : booksList) {
            if (answer.equals("everything")) {
                System.out.println(book.toString());
            } else if (answer.equals("name")) {
                System.out.println(book.getTitle());
            } else if (answer.equals("pages")) {
                System.out.println(book.getPages());
            } else if (answer.equals("years")) {
                System.out.println(book.getPublicationYear());
            }
        }
    }
}
