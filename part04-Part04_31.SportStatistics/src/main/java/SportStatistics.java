
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String file = scan.nextLine();
        System.out.println("Team:");
        String team = scan.nextLine();

        try (Scanner fileScanner = new Scanner(Paths.get(file))) {
            int teamGamesCount = 0;
            int teamLosesCount = 0;
            int teamWinsCount = 0;
            while (fileScanner.hasNextLine()) {
                String row = fileScanner.nextLine();
                String[] parts = row.split(",");
                String homeTeam = parts[0];
                String awayTeam = parts[1];
                int homeTeamScore = Integer.valueOf(parts[2]);
                int awayTeamScore = Integer.valueOf(parts[3]);
                if (homeTeam.equals(team) || awayTeam.equals(team)) {
                    teamGamesCount++;
                    if (homeTeamScore > awayTeamScore && homeTeam.equals(team)) {
                        teamWinsCount++;
                    } else if (homeTeamScore < awayTeamScore && awayTeam.equals(team)) {
                        teamWinsCount++;
                    } else {
                        teamLosesCount++;
                    }
                }
            }
            System.out.println("Games: " + teamGamesCount);
            System.out.println("Wins: " + teamWinsCount);
            System.out.println("Losses: " + teamLosesCount);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

}
