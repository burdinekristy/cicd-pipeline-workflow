package gameday;

import java.util.Scanner;
import gameday.predictions.PredictionApp;
import gameday.schedule.ScheduleApp;
import gameday.scores.ScoreApp;
import gameday.store.StoreApp;
import gameday.tailgate.TailgatePlanningGUI;
import gameday.teams.TeamSelectionApp;
import gameday.trivia.TriviaApp;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("Welcome to College GameDay!");

        while (running) {
            System.out.println("\n-- College GameDay Hub --");
            System.out.println("1. Team Selection");
            System.out.println("2. Game Schedule");
            System.out.println("3. Live Scores");
            System.out.println("4. Game Predictions");
            System.out.println("5. Tailgate Planner");
            System.out.println("6. Merchandise Store");
            System.out.println("7. Trivia Game");
            System.out.println("8. Exit");
            System.out.println("Please select an option (1-8): ");

            int choice = -1;
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
            } else {
                scanner.next();
                System.out.println("Invalid input. Please enter a number between 1 and 8.");
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.println("Launching Team Selection...");
                    TeamSelectionApp.main(args);
                    break;
                case 2:
                    System.out.println("Launching Schedule...");
                    ScheduleApp.main(args);
                    break;
                case 3:
                    System.out.println("Launching Scores...");
                    ScroreApp.main(agrs);
                    break;
                case 4:
                    System.out.println("Launching Predictions...");
                    PredictionApp.main(args);
                    break;
                case 5:
                    System.out.println("Launching Tailgate Planning...");
                    // TailgatePlanningGUI may use a main method or GUI constructor depending on its setup
                    break;
                case 6:
                    System.out.println("Launching Store...");
                    StoreApp.main(args);
                    break;
                case 7:
                    System.out.println("Launching Trivia...");
                    TriviaApp.main(args);
                    break;
                case 8:
                    running = false;
                    System.out.println("Thanks for stopping by! Enjoy College GameDay!");
                    break;
                default:
                    System.out.println("Invalid choice. Please pick between 1 and 8.");
            }
        }
        scanner.close();
    }
}