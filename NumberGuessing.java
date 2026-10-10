// Number Guessing Game in Java

import java.util.*;

public class NumberGuessing {

    public static void guessthenumbergame() {


        Scanner sc = new Scanner(System.in);

        // generating a random number between 1 and 100 by computer
        int number = 1 + (int)(Math.random() * 100);

        // giving attempts to user for guessing the number
        int A = 5;

        System.out.println("---- Hello! My name is javagn ----\nCan you guess the number, Which I have choosen? \nAnd you have only "+ A +" attempts to guess the correct number.");

        System.out.println("So, I have choosen a number between 1 and 100, can you guess?");
        System.out.println("----- Let's Start -----");

        // loop for attempts
        for(int i=0; i<A; i++) {

            System.out.print("Enter your guess: ");
            int guess = sc.nextInt();

            // checking conditions

            if (guess == number) {
                System.out.println("---- Congratulations! ---- \nYou guessed the correct number.");
                sc.close();
                return;
            } else if (guess < number) {
                System.out.println("The number is greater than " + guess);
            } else {
                System.out.println("The number is less than " + guess);
            }
        }     
        
        // if the user runs out of attempts

        System.out.println("You've exhausted all attempts. \nThe correct number was: " + number);
        sc.close();
        
    } 

    public static void main(String args[]) {

        guessthenumbergame();
    }
}