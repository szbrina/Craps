
/**
 * Write a description of class Die here.
 *
 * @author Sabrina Zhang, Aria, Andy 
 * @version 11-1-2022
 */

import java.util.Scanner;
import java.util.Random;
public class Die
{
    // instance variables - replace the example below with your own
    private int dice;

    /**
     * Constructor for objects of class Die
     */
    public Die()
    {
        // initialise instance variables
        dice = 0;
    }

    /**
     * The roll method rolls the six-sided die
     *
     * @return    the value of the die roll (1-6) (integer)
     */
    public int roll()
    {
        dice = (int) (Math.random() * 6 + 1);
        return dice;
    }
}
