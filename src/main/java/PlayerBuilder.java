import java.util.Scanner;

import static java.lang.System.in;
import static label.Action.PAPER;
import static label.Action.ROCK;
import static label.Action.SCISSORS;
import static label.Message.INVALID_INPUT;

public class PlayerBuilder {

    public static Player createPlayer(){
        int action = selectAction();
        return new Player(action);
    }

    private static int selectAction(){
        Scanner input = new Scanner(in);
        int action;
        boolean isValidAction;
        do {
            showOptions();
            action = input.nextInt();
            isValidAction = isValidAction(action);
            if (!isValidAction) {
                showErrorMessage();
            }
        } while(!isValidAction);
        return action;
    }

    private static void showErrorMessage(){
        System.out.println(INVALID_INPUT);
    }

    public static boolean isValidAction(int action){
        return action == PAPER ||
                action == ROCK  ||
                action == SCISSORS;
    }

    private static void showOptions(){
        System.out.println(PAPER + " - Paper");
        System.out.println(ROCK + " - Rock");
        System.out.println(SCISSORS + " - Scissors");
        System.out.printf("Select your option: ");
    }
}
