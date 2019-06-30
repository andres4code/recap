package com.sda.tallinn6.evgenii;

import java.util.Random;
import java.util.Scanner;

//import static ee.sda.tallinn6.practjava.GameChoices.valueOf;

public class RockPaperScissors {

    public static void main(String[] args) {

        Random randomGenerator = new Random();
        while (true) {
            int randomInt = randomGenerator.nextInt(3) + 1;

            Scanner input = new Scanner(System.in);
            String userInput = input.nextLine();

            try {
                GameChoices.valueOf(userInput.toUpperCase());
                if (GameChoices.valueOf(userInput.toUpperCase()).getChoiceCode() == randomInt) {
                    //We should replay

                } else {
                    //We should check who is the winner.

                }
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Option is incorrect");
            }
        }

        //loop_named_one:
        //for (num:nums) {

//        for (int i = 10; i < 10; i++) {
//            System.out.println("hello dude");
//command + J to generate loop

        }

        }



/*
(Game: scissor, rock, paper) Write a program that plays the popular scissor-rock- paper game.
(A scissor can cut a paper, a rock can knock a scissor, and a paper can wrap a rock.)

The program randomly generates a number 0, 1, or 2 representing scissor, rock, and paper.
The program prompts the user to enter a number 0, 1, or 2
and displays a message indicating whether the user or the computer wins, loses, or draws.

Here are sample runs:
scissor (0), rock (1), paper (2)
The computer is scissor. You are rock. You won

you win:
d userInput
computer user
0 1
1 2
2 0





 */
/*
public class RockPaperScissors {
    public static void main(String[] args) {
        Random rand = new Random();
        int d = rand.nextInt(3);

        Scanner input = new Scanner(System.in);
        System.out.println("Your hand gesture(0,1,2): ");
        Integer userInput = input.nextInt();
        Integer user = userInput;
        Integer computer = d;

        int yourScore = 0;
        int computerScore = 0;

        if ( (computer == 0) > (user == 1)) {//USE &&&&&&&&&&&&&&&&& instead!!!!!!!!!!!!
            System.out.println("You won!");
            yourScore++;
            System.out.println("Your score: " + yourScore);
            System.out.println("Computer score: " + computerScore);
        }else if( (d ==) > (userInput==)) {
            System.out.println("You won!");
            yourScore++;
            System.out.println("Your score: " + yourScore);
            System.out.println("Computer score: " + computerScore);
        }else if ( (d ==) > (userInput==)){
            System.out.println("You won!");
            yourScore++;
            System.out.println("Your score: " + yourScore);
            System.out.println("Computer score: " + computerScore);



        }else if(d < userInput){
            System.out.println("Computer won, you lost");
            computerScore++;
            System.out.println("Your score: " + yourScore);
            System.out.println("Computer score: " + computerScore);
        }else if(d < userInput){
            System.out.println("Computer won, you lost");
            computerScore++;
            System.out.println("Your score: " + yourScore);
            System.out.println("Computer score: " + computerScore);
        }else if(d < userInput){
            System.out.println("Computer won, you lost");
            computerScore++;
            System.out.println("Your score: " + yourScore);
            System.out.println("Computer score: " + computerScore);


        }else if(d==userInput){
            System.out.println("draw");
            System.out.println("New game shall begin");
            System.out.println("Computer score: " + computerScore);
            System.out.println("Your score: " + yourScore);



        }
    }
}

 */

