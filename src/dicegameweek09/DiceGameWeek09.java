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
public class DiceGameWeek09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        int numberOfDices; // number of dices that user decides to roll.
        int numberOfThrows; // number of times that user roll the dices
        int diceValue; // Current dice value
        int totalPoint=0; // total value when dices throw bounces times.
        int userPoint;//User guess points.
        int i=0;//count to stop loop
        int average;
        int totalPlay=1;//Number of times user have played.
        int totalWin=0;//Number of times user win.
        float percentageWin;//winning percentage
        System.out.println("Wellcome to Dice Game!");
        
        do{
            // User chooses the number of dices to roll
            System.out.println("How many dices would you like to roll?");
            numberOfDices = input.nextInt();
            // User chooses times to throw the dices
            System.out.println("How many times would you like to throw the dices?");
            numberOfThrows = input.nextInt();
            
            DiceWeek09 myDice = new DiceWeek09(numberOfDices,numberOfThrows);
            myDice.Throw();
            totalPoint=myDice.getTotalPoints();
            System.out.printf("Total points of %d dices with %d times throws are: %d\n",numberOfDices,numberOfThrows,totalPoint);
            
            //User guesses points
            System.out.println("User guess points: ");
            userPoint=input.nextInt();
            
            //Check whether user guesses right or wrong
            if(userPoint==totalPoint){
                totalWin++;
                System.out.println("You win!");
                System.out.printf("Total points of dices are: %d\n",totalPoint);
            }
            else{
                System.out.println("You loose!");
                System.out.printf("Total points of dices are: %d\n",totalPoint);
            }
            System.out.println("Would you like to play again? Y/N");
            String answer=input.next();
            String upperCaseAnswer=answer.toUpperCase();
            if(upperCaseAnswer.equals("Y")){
                i++;
                totalPlay++;
            }
            else
                i=0;
                
        }while(i!=0);
        percentageWin = (float)((totalWin*100)/totalPlay);
        System.out.printf("%nYou've played %d times.%n",totalPlay);
        System.out.printf("You've won %d times.",totalWin);
        System.out.printf("\nYour winning percentage is %s.%n",percentageWin+"%");
        System.out.println("Goodbye!");
    }
    
}
