import java.util.Random;
import java.util.Scanner;

public class Game {

    Random randGen = new Random();
    Scanner guessScan = new Scanner(System.in);

    int randNum, newGuess, tries;

    public Game() {
        randNum = randGen.nextInt(100);
    }

    public int getRandNum() {
        return this.randNum;
    }

    public Integer compareNum(int guessNum) {
        int result = this.randNum - guessNum;

        if (result > 0) {
            return 1;
        } else if (result < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    public void showGuessMenu() {
        for(;;) {
            tries += 1;

            System.out.print("-> (Press ctrl+c to exit) Write your guess: ");
            newGuess = guessScan.nextInt();
            
            int comp = compareNum(newGuess);
            
            if (tries >= 5) {
                System.out.println("Sorry, you exceed the number of tries (5). Secret number: " + getRandNum());
                return;
            }

            if (comp == 0) {
                System.out.println("\t" + "Congrats, you guess the number!");
                System.out.println("Number of tries: " + tries);
                return;
            }
            if (comp > 0) {
                System.out.println("\t" + newGuess + " is lower than secret number.");
            } else if (comp < 0) {
                System.out.println("\t" + newGuess + " is higher than secret number.");
            }
        }
    }

}
