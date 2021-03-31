/*
       Create a class game, which allows a user to play "Guess the number"
       Game once
       Game should have to following methods:
       1. Constructor to generate the random number
       2. takeUserInput() to take a user input of number
       3. isCorrectNumber() to detect whether the entered by the user is true
       4. getter and setter for noOfGuesses:

          Properties:
           noOfGuesses(int)
           43
           loop - number of guess is score
        */
package com.company;

import java.util.Scanner;

class game{
    int random;
    int userInput;
    int guess = 0;
    char check = 'N';


    public game()
    {
        random = (int)(Math.random()*26);
    }
    int getRandom()
    {
        return random;
    }
    void takeUserInput(int n)
    {
        userInput = n;
    }
    void isCorrectNumber()
    {
        Scanner scan = new Scanner(System.in);
        while(check != 'Y') {
            if (userInput == random) {
                System.out.println("YOU WON !\nwith " + guess + " number of Guesses ..");
                check = 'Y';
            } else if (userInput > random) //near to random number r = s/ u = b
            {
                System.out.println("You moved ahead than the random Number");
                userInput = scan.nextInt();
                guess++;
                check = 'N';
            }
            else if (userInput < random)//far from random number
            {
                System.out.println("You are behind than the random Number");
                userInput = scan.nextInt();
                guess++;
                check = 'N';
            }
        }
    }
    int scores()
    {
        return guess;
    }
    int guessedNumber()
    {
        return random;
    }


}
public class CWH_43_P8_GuessNumber {
    public static void main(String[] args) {
       game user_1 = new game();
       Scanner scan = new Scanner(System.in);

        System.out.println("\t--- Welcome to Guess game ---");
        System.out.println("Number of Guesses will be counter as your scores");
        System.out.println("Now guess a number between 0 to 25 ");
        user_1.takeUserInput(scan.nextInt());
        user_1.isCorrectNumber();
        System.out.println("Random number was: " + user_1.guessedNumber());
        System.out.println("Your score is: " + user_1.scores());
    }

}
