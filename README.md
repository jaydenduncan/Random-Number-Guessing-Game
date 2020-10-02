# Random-Number-Guessing-Game
This project generates a random number and allows the user to see how many tries it takes them to guess the correct number.

## Table of Contents
* [Project Info](#project-info)
  * [User Input and Errors](#user-input-and-errors)
* [Installation](#installation) 
  * [Software Requirements](#software-requirements)
  * [Netbeans Download](#netbeans-download)
  * [Java Software Installation](#java-software-installation)
    * [Windows and Linux](#windows-and-linux)
    * [OS X](#os-x)
    * [Platform-Independent Package](#platform-independent-package)
* [Usage](#usage)
* [Contributing](#contributing)
* [License](#license)
  
---

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

---

## Installation 
The following are a few basic instructions for downloading Netbeans to your local machine for Java. For more information on the installation of any version of this IDE to your computer, refer to the [Documentation Section](https://netbeans.org/kb/?utm_source=netbeans&utm_campaign=welcomepage) of the [Netbeans website](https://netbeans.org/).
### Software Requirements
* [Java SE Development Kit (JDK) 8](http://www.oracle.com/technetwork/java/javase/downloads/index.html)
* [Netbeans IDE](https://netbeans.org/downloads/)
  * *Select Java SE or Java EE for the language*

### Netbeans Download
1. Go to the [Netbeans](https://netbeans.org/downloads/) website and select a Java language and the platform
2. Click 'Download' for the correct language and platform
3. Save installer file to your system

### Java Software Installation

#### Windows and Linux
1. Run the Installer
  * Windows: Installer executable file has .exe file extension
  * Linux: Installer executable file has .sh file extension
  
    For Linux, use this command to make the installer files executable:
    ```
    chmod +x <installer-file-name>
    ```
    Type this command to run the installer:
    ```
    /<installer-file-name>
    ```
2. Click 'Next' at the installation wizard.
3. Review the license agreement, accept it, and click 'Next'.
4. Accept default installation directory for Netbeans IDE or choose another one.
5. Accept JDK installation to use with Netbeans and then click 'Next'.
6. Verify all information on the summary page and then click 'install' to start installation.
7. Click 'Finish' after the installation is complete.

#### OS X
1. After downloading Netbeans, run the installer file with the .dmg file extension.
2. Double-click the package icon with the .pkg file extension.
3. At the "This package will run a program to determine if the software can be installed" dialog box, click 'Continue'.
4. Click 'Continue' at the Introduction page.
5. Review license agreement, accept it, and click 'Continue'.
6. Select the drive at the 'Select a Destination' page, and click 'Continue'.
7. Select the products that will be installed and enter administrator's name and password.
8. Click 'OK' to begin the installation.

#### Platform-Independent Package
1. After downloading the platform-independent ZIP file, extract it to any folder.
2. Run the executable file in the netbeans/bin directory.
3. Accept License Agreement.
4. Click 'Next' to start the Netbeans IDE installation.

To manually add a path to the JDK installation directory:
1. Open netbeans.conf file found in the netbeans/etc directory, in a text editor.
2. Enter location of compatible JDK installation for netbeans_jdkhome option:
   ```
   C:\Program Files\Java\jdk1.8.0
   ```
3. Save netbeans.conf file and run executable in the netbeans/file directory.

--- 

## Usage
To clone a repository on Github:
1. Under repository name, click 'Clone or Download'.
2. Copy the clone URL in the 'Clone with HTTPs' section.
3. Open Git Bash and change the current working directory to the location you want it to be in.
4. Type 'git clone' followed by the URL and then press **Enter**:
   ```
   $ git clone https://hostname/USERNAME/REPOSITORY
   ``` 
For more information on cloning for Github, review the website for [Github Docs](https://docs.github.com/en/free-pro-team@latest/github/creating-cloning-and-archiving-repositories/cloning-a-repository).
 
After retrieving the files from the repository, the java file can be accessed in Netbeans. See the [Netbeans Quick Start Guide](https://netbeans.org/kb/docs/java/quickstart.html) for information on how to run a project. Also, see the [Project Info](#project-info) section earlier in this README.md file for information on how this project works.

---

## Contributing
Pull requests are welcome at any time!

---

## License
[![Github license](https://img.shields.io/github/license/jaydenduncan/Random-Number-Guessing-Game)](https://github.com/jaydenduncan/Random-Number-Guessing-Game/blob/master/LICENSE)

Licensed under the [MIT License](https://opensource.org/licenses/MIT)
