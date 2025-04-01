import java.util.Random;
import java.util.Scanner;

public class Game {

    Random randGen = new Random();
    Scanner guessScan = new Scanner(System.in);

    int randNum, newGuess;

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
        System.out.print("Write your guess: ");
        newGuess = guessScan.nextInt();
    }

}
