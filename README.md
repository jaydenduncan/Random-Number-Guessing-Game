# Random-Number-Guessing-Game
This project generates a random number and allows the user to see how many tries it takes them to guess the correct number.

## Table of Contents
* [Project Info](#project-info)
  * [User Input and Errors](#user-input-and-errors)

## Project Info
To begin this project, all classes from the 'java.util' package are imported. The only class that is used in this project from that package is the 'Scanner' class, which is used for input purposes. Alternatively, the asterisk character following the package name could have been replaced with 'Scanner':
```
import java.util.Scanner
```
Using the asterisk character instead of the class name indicates that all of the classes from the package are going to be imported into the project. Java is centered around object-oriented programming which means that all statements are executed inside of a class. The class inside the project contains a main method which is the starting point for any java program. The first statement executed in the main method is a call to the start method. The start method is defined as a public static method of the class, meaning that it is accessible to the main method. The purpose of the start method is the check for valid input by the user from the numberGame method, recalling the method when neccessary. 
The numberGame method is also public and static, and its purpose is to control the flow of the guessing game. It first declares three integer variables and then generates a random number between 1 and 100 using the Math class. This random integer is stored in the 'randomNumber' integer variable. A do-while loop comes after this and it loops through a number of statements that will get the user's guess of the random number until the user guesses the number right. If the user doesn't guess the right number, the program tells them whether their guess was higher or lower than the random number. Inside the do-while loop, errors from the user's input can also be detected. These errors are handled in the start method. The user's number of guesses are incremented after entering valid input. When the user guesses the correct answer, a congratulations message is printed to the console. 

### User Input and Errors
The start method contains a try block that contains a call to the numberGame method, which tells the computer to check that method for any exceptions. In the numberGame method, the program prompts for the user's guess and checks to see if their input is valid. One thing the program checks is if the user's input matches the type of input that's requested. The program tells the user to enter an integer as their guess, which means anything else the user enters, such as a word or character would be unacceptable. The program requests for an integer using the Scanner class object and the 'nextInt' method. The format for creating a valid object for input from the Scanner class in Java is as follows:
```
Scanner nameofObject = new Scanner(System.in)
```
After a Scanner object is created, input can be requested by outputting a prompt statement and using one of the methods of the Scanner class. Some of the methods include:
* nextByte()
* nextInt()
* next()
* nextLine()
* nextDouble()
* nextFloat()
* nextLong()
* nextShort()

After the user enters some form of input, the program checks the input, and if the input doesn't match what was requested, an 'InputMismatchException' is thrown. Since the start method of the project contains a try and catch block, this exception can be handled. The format of a try and catch block looks something like this:
```
try{
  //Some code
}
catch(Exception e){
  //Error message
}
```
In the project, once the user enters a word or character for input instead of an integer, the project goes to the catch block in the start method and outputs an error message and does any other code statements in that block. The user is going to have to try again and enter a valid input token after receiving the error message, so the start method is recalled in the catch block, so not only will the user re-enter input, but the numberGame function will be 'tried' again in case the user enters another invalid input token. More input is checked in the numberGame method but in a much simpler form of an if statement. The program checks to see if the integer entered by the user is less than 1 or greater than 100, and if so, an error message is printed and the 'continue' keyword follows it to start the do-while loop over again without incrementing the number of guesses.

## Installation
### Installing Git


## Usage
