import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Guess a random number from 0-100\nType \"quit\" to quit the program: ");

        while (true) {
            try {
                int randomNum = (int) (Math.random() * 101);
                //Input
                Scanner scanner = new Scanner(System.in);
                int guess;
                String input = scanner.nextLine();

                //Quit option
                if (input.equalsIgnoreCase("quit")) {
                    break;
                }
                //If not quitting the String turns into int
                else {
                    guess = Integer.parseInt(input);
                }
                if (guess == randomNum) {
                    System.out.println("You are correct");
                    continue;
                }
                //Stops from guessing under 0 or over 100
                if (guess < 0 || guess > 100) {
                    System.out.println("Can only guess a number between 0 and 100");
                }
                else {
                    System.out.println("You are wrong, the random number is " + randomNum);
                    System.out.println("Type \"quit\" to quit or keep guessing!");
                }
            }
            //Exception for letters being input so the program doesn't crash
            catch (Exception e) {
                System.out.println("Invalid input");
            }
        }
    }
}
