/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*Title: Random Number Guessing Game
  Author: Jayden Duncan
  Created: September 30, 2020
  Description: This project generates a random number and allows the user to 
               see how many tries it takes them to guess the correct number.
  Code Language: Java
*/
package randomnumberguessinggame;

import java.util.*;
public class RandomNumberGuessingGame {
    
    //creates an object of the Scanner class for user input
    public static Scanner console = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        start(); //calls the start method, which is defined for error purposes
        
    }
    
    public static void start(){
        String input; 
        
        System.out.println("----------------------------------------------");
        System.out.println("I am thinking of a number between 1 and 100...");
        System.out.println();
        
        //try block tests the numberGame method for valid input
        try{
            numberGame();
        }
        catch(Exception e){
            System.out.println("ERROR: Your guess cannot contain words or "
                    + "characters!\nReseting Game...\n\n");
            input = console.nextLine(); //clears input buffer in case of invalid input
            start(); //recalls start method to retest the numberGame method for errors
        }
    }
    
    public static void numberGame(){
        int randomNumber; //will hold the random number
        int userInput; //will hold each guess entered by the user
        int numberOfGuesses = 0; //will count the number of guesses
        
        //generates a random number between 1 and 100 using the Math class
        randomNumber = (int)(Math.random()*100) + 1;
        
        do{
            System.out.println();
            System.out.println("Guess a number between 1 and 100: ");
            userInput = console.nextInt(); //grabs user's guess
            
            if((userInput<1)||(userInput>100)){
                System.out.println("ERROR: Your guess must be a number"
                        + " between 1 and 100");
                continue; //skips back to top of the do-while loop to avoid incrementing guesses
            }
   
            if(userInput > randomNumber){
                System.out.println(userInput + " is too high.");
                numberOfGuesses++;
            }
            
            if(userInput < randomNumber){
                System.out.println(userInput + " is too low.");
                numberOfGuesses++;
            }
        }while(userInput != randomNumber);
        
        numberOfGuesses++; //adds extra guess to count for correct guess
        System.out.println("Congratulations, you guessed it! It took you "
                + numberOfGuesses + " guess(es)!");
    }
    
}
