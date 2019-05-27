import java.util.Scanner;

import static java.lang.System.in;
import static label.Action.*;

public class Runner {

    public static void main(String[] args) {
        Judge judge = new Judge();
        System.out.println("\nPlayer One turn ");
        Player firstPlayer = createPlayer();
        System.out.println("\nPlayer Two turn ");
        Player secondPlayer = createPlayer();
        String winner = judge.applyRulesToDecideWinner(firstPlayer, secondPlayer);
        System.out.println(winner);
    }

    public static Player createPlayer(){
        int action = selectAction();
        return new Player(action);
    }

    public static int selectAction(){
        Scanner input = new Scanner(in);
        showOptions();
        return input.nextInt();
    }

    public static void showOptions(){
        System.out.println(PAPER + " - Paper");
        System.out.println(ROCK + " - Rock");
        System.out.println(SCISSORS + " - Scissors");
        System.out.printf("Select your option: ");
    }
}
