/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dicegameweek09;

/**
 *
 * @author uyen
 */
import java.util.Random;
import java.util.Scanner;
public class DiceWeek09 {
    Scanner input = new Scanner (System.in);
    private int numberOfDices; // number of dices that user decides to roll.
    private int numberOfThrows; // number of times that user roll the dices
    private int diceValue; // Current dice value
    private int totalPoint=0; // total value when dices throw bounces times.
    private int userPoint;//User guess points.
    private int average;
    
    //Constructor
    public DiceWeek09(int numDices, int numThrow)
    {
        numberOfDices=numDices;
        numberOfThrows=numThrow;
    }
    public DiceWeek09()
    {
    }
    
    // One dice with one throw
    // return a random number between 1-6
    public int OneDiceOneThrow()
    {
        diceValue = 1 + (int)(Math.random()*6);
        return diceValue;
    }
    
    // Multi dices with one throw
    public int MultiDicesOneThrow()
    {
        for(int i=0; i<numberOfDices; i++)
           totalPoint += OneDiceOneThrow();
        return totalPoint;
    }
    
    // Multi dices with multi throws
    public void Throw()
    {
        for(int i=0; i<numberOfThrows;i++)
            totalPoint += MultiDicesOneThrow();
        average = totalPoint/numberOfThrows;
    }
    
    public int getTotalPoints()
    {
        return totalPoint;
    }
    
    public int getAverage()
    {
        return average;
    }
    
   
}
