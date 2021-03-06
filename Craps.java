
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
    public static void main(String[] args)
    {
        //creating the object for the game
        Die d1 = new Die();
        Die d2 = new Die();

        int roll1 = d1.roll();
        int roll2 = d2.roll();
        int rollTotal = roll1 + roll2;
        Scanner in = new Scanner(System.in);
        System.out.println("Let's play Craps!");
        System.out.println("Would you like to know the rules? (Y/n)");
        String rules = in.nextLine();
        if(rules.substring(0,1).equals("Y"))
        {
            System.out.println("     A player rolls two six-sided dice and adds the numbers rolled together.");
            System.out.println("     On the first roll, a 7 or an 11 automatically wins, and a 2,3 or 12 automatically loses.");
            System.out.println("     If a 4, 5, 6, 8, 9, or 10 is rolled on the first roll, that number becomes the 'point'");
            System.out.println("     The player continues to roll the two dice until one of two things happens:");
            System.out.println("     either they roll the 'point' from that first roll again, in which they win;");
            System.out.println("     or they roll a 7 in which case they lose.");
        }

        //rolling first dice
        boolean firstRoll = true;
        System.out.println("Do you want to roll the dice? (Y/n)");
        String rolling = in.nextLine();
        if (rolling.substring(0,1).equalsIgnoreCase("Y"))
        {
            firstRoll = true;
        }
        else
        {
            firstRoll = false;
        }
        
            while (firstRoll)
            {
                //opening and rules
                d1 = new Die();
                d2 = new Die();
                roll1 = d1.roll();
                roll2 = d2.roll();
                rollTotal = roll1 + roll2;

                System.out.println("Press [Enter] to roll the dice...");
                in.nextLine();
                System.out.println("You rolled a " + roll1 + " and a " + roll2);
                int total = d1.roll() + d2.roll();
                System.out.println("Your total is " + rollTotal);
                //specific numbers rolled, end game --> results
                if(rollTotal == 7 || rollTotal == 11)
                {
                    System.out.println("You won!");
                }
                else if (rollTotal == 2 || rollTotal == 3 || rollTotal == 12)
                {
                    System.out.println("You lose!");
                }
                else
                {
                    int points = rollTotal;
                    //continuation of the game if they do not automatically win or lose
                    boolean play = true;
                    while(play)
                    {
                        System.out.println("Your points are " + points + ". Match your point to win!");
                        System.out.println("Press [Enter] to roll the dice...");
                        in.nextLine();

                        roll1 = d1.roll();
                        roll2 = d2.roll();
                        rollTotal = roll1 + roll2;

                        System.out.println("You rolled a " + roll1 + " and a " + roll2);
                        System.out.println("Your total is " + rollTotal);

                        if (rollTotal == points)
                        {
                            System.out.println("It's a match. You win!");
                            play = false;
                        }
                        else if (rollTotal == 7)
                        {
                            System.out.println("Your rolled a 7. You lose!");
                            play = false;
                        }
                    }

                }
                //end of game; ask if they want to play again
                System.out.println("Do you want to play again? (Y/n)");
                String playAgain = in.nextLine();
                if(playAgain.equals(""))
                {
                    break;
                }
                if(playAgain.substring(0,1).equalsIgnoreCase("n"))
                {
                    break;
                }
            }
            System.out.println("Thanks for playing!");
        }
    }
}

/*

COMMENTS FROM THE INSTRUCTOR:

Hi, Sabrina. I'm going to include some comments here that are similar to that
given to another student.. I'll follow up on these comments when I see
you in class.

This is such a *clean* program in the way you've arranged the code on the
page--it makes it much more legible to read, and perhaps reflects your organized
approach to writing it. You have correctly implemented the rules of the game, and
the flow of play is quite good.

Here are some recommendations for you.

1. You implemented a "default Yes/No" feature for the play again question, and
   that worked well. Ideally, you would indicate that by saying "(Y/n)", with
   the capital letter indicating the default option. And the default option at
   the end of the game *should* be to keep playing, not to quit. Make it as
   easy as possible for people to keep playing the game!

2. Along those lines, it's pretty annoying to have to refuse the instructions
   everytime a new game begins. It probably makes sense to put that question
   before the main game loop starts so the player doesn't have to keep dealing
   with that.

3. A very small point: In the main part of the game you actually get the dice
   rolls right after the user hits [Enter], and that's a good, logical place
   to make that happen. In the first roll, you set up the dice and roll them
   (twice?) before you've even gotten to asking them to roll the dice, which
   is a little confusing, and inconsistent with what you did later. I'd move
   that code to a more logical place in your program.

SCORE: 48/50

*/

