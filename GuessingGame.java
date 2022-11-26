import java.util.Scanner;
import java.lang.Math;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nHello and welcome to a Guessing Game!");
        System.out.println("Please guess a number between 1 and 10. You have three guesses:");

        int numberOfGuesses = 0;
        int secret = (int)(Math.random() * 10);
		System.out.println("Random number: " + secret);

        
        System.out.println("\nWhat is your first guess?");
        int guessesOne = scan.nextInt();
        numberOfGuesses ++;
        
        if (guessesOne == secret) {
            System.out.println("You won!");
            
        }else{

        System.out.println("\nWhat is your second guess?");
        int guessesTwo = scan.nextInt();
        numberOfGuesses ++;
        
        if (guessesTwo == secret) {
            System.out.println("You won!");
        }else{

        System.out.println("\nWhat is your third guess?");
        int guessesThree = scan.nextInt();
        numberOfGuesses ++;
        
        if (guessesThree == secret) {
            System.out.println("You won!");
        }else if (numberOfGuesses == 3) {
            System.out.println("Haha you lost >:( you reached your third guess!");
        }
    }
    }

        scan.close();
    }
}
