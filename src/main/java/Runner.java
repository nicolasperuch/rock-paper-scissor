import java.util.Scanner;

import static java.lang.System.in;

public class Runner {

    public static void main(String[] args) {
        System.out.println("Welcome to Jokenpo");
        Player firstPlayer = createPlayer();
        Player secondPlayer = createPlayer();
        Judge judge = new Judge();
        String winner = judge.applyRulesToDecideWinner(firstPlayer, secondPlayer);
        System.out.println(winner);
    }

    public static Player createPlayer(){
        int action = selectAction();
        return new Player("Player " + action, action);
    }

    public static int selectAction(){
        Scanner input = new Scanner(in);
        showOptions();
        return input.nextInt();
    }

    public static void showOptions(){
        System.out.println(Actions.PAPER + " - Paper");
        System.out.println(Actions.ROCK + " - Rock");
        System.out.println(Actions.SCISSORS + " - Scissors");
        System.out.printf("Select your option: ");
    }
}
