import java.util.Scanner;// to take input from the user
import java.util.Random; // to generate random number 
// class represent the blueprint 
public class guessgame{
    //this is called a method, main is the starting point of the program real shit happens here
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);// takes input from user
        Random random = new Random();// generate random number 
        

        int targetNum = random.nextInt(100)+ 1;// this will generate target num between 1 to 100(random.Nextint(100)generate between 0to99 +1 makes it 1 to 100)

        int guess;// to store the input
        int attempts = 0;// counts the number of guesses 
        int maxattempts = 10;
        System.out.println("--Welcome to the guessing game--");
        System.out.println("guess a number between 1 to 100");
        System.out.println("you have only 10 attempts, best of luck!!");

// ensure user have only 10 attempts to guess the number         
        while(attempts < maxattempts){
            System.out.print("Attempt "+ (attempts + 1) + " Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;


            if(guess == targetNum){
                System.out.println("you guessed the number!! in "+ attempts+ " attempts.");
                break;
             } else if(guess < targetNum){
                    System.out.println("too low , try again");
                }
                else{
                    System.out.println("too high, try agian");
                }

                if(attempts == maxattempts){
                    System.out.println("you ran out of chances better luck next time :(");
                    System.out.println("the number was"+ targetNum);
                }
            }    
            


            scanner.close();
        



        
    }
    
}
