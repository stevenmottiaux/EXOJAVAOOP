import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Name:");
            String programName = scanner.nextLine();
            if (programName.isEmpty()) {
                break;
            }
            System.out.println("Duration:");
            int duration = Integer.valueOf(scanner.nextLine());
            programs.add(new TelevisionProgram(programName, duration));
        }
        System.out.println("Program maximum duration ?");
        int maximumDuration = Integer.valueOf(scanner.nextLine());
        for (TelevisionProgram program : programs) {
            if (maximumDuration >= program.getDuration()) {
                System.out.println(program.toString());
            }
        }
    }
}
