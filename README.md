# Random-Number-Guessing-Game
This project generates a random number and allows the user to see how many tries it takes them to guess the correct number.

## Project Info
To begin this project, all classes from the 'java.util' package are imported. The only class that is used in this project from that package is the 'Scanner' class, which is used for input purposes. Alternatively, the asterisk character following the package name could have been replaced with 'Scanner':
```
import java.util.Scanner
```
Using the asterisk character instead of the class name indicates that all of the classes from the package are going to be imported into the project. Java is centered around object-oriented programming which means that all statements are executed inside of a class. The class inside the project contains a main method which is the starting point for any java program. The first statement executed in the main method is a call to the start method. The start method is defined as a public static method of the class, meaning that it is accessible to the main method. The purpose of this method is the check for valid input by the user from the numberGame method, recalling the method as neccessary. 
The numberGame method is also public and static, and its purpose is to control the flow of the entire guessing game. It first declares three integer variables and then generates a random number between 1 and 100 using the Math class. This random integer is stored in the 'randomNumber' integer variable. A do-while loop comes after this and it loops through a number of statements that will get the user's guess of the random number until the user guesses the number right. If the user doesn't guess the right number, the program tells them whether their guess is higher or lower than the random number. Inside the do-while loop, errors from the user's input can also be detected. These errors are handled in the start method. The user's number of guesses are incremented after entering valid input. When the user guesses the correct answer, a congratulations message is printed. 

### User Input and Errors
