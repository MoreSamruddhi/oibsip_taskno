import java.util.Random;
import java.util.Scanner;

public class numberguessing {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int low = 1;
        int high = 100;
        int NumberToGuess = random.nextInt(high - low + 1) + low;
        int NumberOfTries = 0;
        boolean GuessedCorrectly = false;

        System.out.println("Welcome to Number Guessing Game!!!");
        System.out.println("I Selected number between" + low + " and " + high + ". \n Try to guess...");

        while (!GuessedCorrectly){
            System.out.print("Enter your Guess-");
            int userGuess = scanner.nextInt();
            NumberOfTries++;
            
            if(userGuess < NumberToGuess) {
                System.out.println("Number is Higher! Try Again!!!");
            } else if (userGuess > NumberToGuess ) {
                System.out.println("Number is Lower! Try Again...");
            } else {
                GuessedCorrectly = true;
                System.out.println("Congratulations!!! \n You have guessed Number Correctly." + NumberToGuess + " in " + NumberOfTries + " tries. ");
                switch(NumberOfTries){
                    case 1:
                    System.out.println("Your Score is 100");
                    break;
                    case 2:
                    System.out.println("Your Score is 90");
                    break;
                    case 3:
                    System.out.println("Your Score is 80");
                    break;
                    case 4:
                    System.out.println("Your Score is 70");
                    break;
                    case 5:
                    System.out.println("Your Score is 60");
                    break;
                    case 6:
                    System.out.println("Your Score is 50");
                    break;
                    case 7:
                    System.out.println("Your Score is 40");
                    break;
                    case 8:
                    System.out.println("Your Score is 30");
                    break;
                    case 9:
                    System.out.println("Your Score is 20");
                    break;
                    case 10:
                    System.out.println("Your Score is 10");
                    break;
                }
            } 
            }
            }  
        }
