public class Judge {

    private static final String PLAYER_1_WINNER = "Player 1 won";
    private static final String PLAYER_2_WINNER = "Player 2 won";
    private static final String DRAW = "DRAW!!!!";

    public String applyRulesToDecideWinner(Player firstPlayer, Player secondPlayer){
        if(hasPlayersChooseSameAction(firstPlayer, secondPlayer)){
            return DRAW;
        }
        return decideWinner(firstPlayer, secondPlayer);
    }

    public boolean hasPlayersChooseSameAction(Player firstPlayer, Player secondPlayer){
        return firstPlayer.getAction() == secondPlayer.getAction();
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
        return action == Actions.PAPER;
    }

    public boolean isPlayerActionRock(int action) {
        return action == Actions.ROCK;
    }

    public boolean isPlayerActionScissors(int action) {
        return action == Actions.SCISSORS;
    }
}