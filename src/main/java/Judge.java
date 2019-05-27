import static label.Message.*;
import static label.Action.*;

public class Judge {

    public String applyRulesToDecideWinner(Player firstPlayer, Player secondPlayer){
        if(hasPlayersChooseSameAction(firstPlayer.getAction(), secondPlayer.getAction())){
            return DRAW;
        }
        return decideWinner(firstPlayer, secondPlayer);
    }

    public boolean hasPlayersChooseSameAction(int firstPlayerAction, int secondPlayerAction){
        return firstPlayerAction == secondPlayerAction;
    }

    public String decideWinner(Player firstPlayer, Player secondPlayer){
        if(isPlayerActionPaper(firstPlayer.getAction())){
            return isPlayerActionRock(secondPlayer.getAction()) ?
                    PLAYER_1_WINNER : PLAYER_2_WINNER;
        }

        if(isPlayerActionRock(firstPlayer.getAction())){
            return isPlayerActionScissors(secondPlayer.getAction()) ?
                    PLAYER_1_WINNER : PLAYER_2_WINNER;
        }

        return isPlayerActionPaper(secondPlayer.getAction()) ?
                PLAYER_1_WINNER : PLAYER_2_WINNER;
    }

    public boolean isPlayerActionPaper(int action) {
        return action == PAPER;
    }

    public boolean isPlayerActionRock(int action) {
        return action == ROCK;
    }

    public boolean isPlayerActionScissors(int action) {
        return action == SCISSORS;
    }
}