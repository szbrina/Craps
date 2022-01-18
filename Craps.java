
/**
 * basic rules for playing craps are relatively simple:
 1. A player rolls two six-sided dice and adds the numbers rolled together.
 2. On this first roll, a 7 or an 11 automatically wins, and a 2, 3, or 12 
 automatically loses, and play is over. If a 4, 5, 6, 8, 9, or 10 are 
 rolled on this first roll, that number becomes the "point.”
 3. The player continues to roll the two dice again until one of two things 
 happens: either they roll the "point" from that first roll again, 
 in which case they win; or they roll a 7, in which case they lose.
 *
 * @author Sabrina Zhang, Aria, Andy
 * @version 11-1-2022
 */

import java.util.Scanner;
import java.util.Random;
public class Craps
{
    public void main(String args[])
    {
    System.out.println("Do you want to play a game (yes/no)?");
        Scanner scan = new Scanner(System.in);
        String answer = scan.nextLine();
        while(answer.equals("yes") || answer.equals("Yes"))
        {
            System.out.println("Enter a number (1-10): ");
            int guess = scan.nextInt();
            //Random rand = new Random();
            int computerGuess = (int) (Math.random() *10 +1);
            int i = 1;
            while(i <= 2 && computerGuess != guess)
            {   
                 if(computerGuess < guess)
                {
                    System.out.println("Your guess is too high");
                    System.out.println("Enter a number (1-10): ");
                    guess = scan.nextInt();
                    i++;
                }
                else if(computerGuess > guess)
                {
                    System.out.println("Your guess is too low");
                    System.out.println("Enter a number (1-10): ");
                    guess = scan.nextInt();
                    i++;
                }
                
            }
            if(guess == computerGuess)
            {
                System.out.println("You are right!");
                System.out.println("Do you want to continue to play the game (yes/no)?");
                scan.nextLine();
                answer = scan.nextLine();
            }
            else if(guess != computerGuess)
            {
                System.out.println("The correct number is " + computerGuess);
                System.out.println("Do you want to continue to play the game (yes/no)?");
                scan.nextLine();
                answer = scan.nextLine();
            }
        }
        System.out.println("Thank you for playing my game!");
    }
}
