package gameday.trivia;

import java.util.Scanner;

public class TriviaApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TriviaGame game = new TriviaGame();

        System.out.println("Welcome to College GameDay Trivia!");
        System.out.println("Answer the following questions:");

        for (TriviaQuestion question : game.getQuestions()) {
            System.out.println("\n" + question.getQuestion());
            System.out.println("Your answer: ");
            String userAnswer = scanner.nextLine();

            if (question.isCorrect(userAnswer)) {
                System.out.println("Correct!");
                game.incrementScore();
            } else {
                System.out.println("Incorrect. The correct answer was: " + question.getAnswer());
            }
        }

        System.out.println("\nGame Over!: " + game.getScore() + "/" + game.getQuestions().size());
        scanner.close();
    }
}