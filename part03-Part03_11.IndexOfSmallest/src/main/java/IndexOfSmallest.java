
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 9999) {
                break;
            }

            list.add(input);
        }

        int smallest = list.get(0); // initialize the greatest number to the first number in the list

        for (int i = 0; i < list.size(); i++) { // iterate through the list
            int number = list.get(i); // get the number at the current index in the list
            if (number < smallest) { // if the number is greater than the current greatest number
                smallest = number; // set the number to the current greatest number
            }
        }
        System.out.println("The smallest number: " + smallest); // print the greatest number

        for (int i = 0; i < list.size(); i++) { // iterate through the list
            if (list.get(i) == smallest) { // if the number at the current index is the greatest number
                System.out.println("Found at index: " + i); // print the index
            }
        }

        // implement here a program that reads user input
        // until the user enters 9999

        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times

    }
}
