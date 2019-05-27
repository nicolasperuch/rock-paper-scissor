import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;
import static label.Action.*;
import static label.Result.*;


public class JudgeTest {

    private Judge judge;
    private Player playerOne;
    private Player playerTwo;

    @Before
    public void setUp(){
        judge = new Judge();
        playerOne = new Player();
        playerTwo = new Player();
    }

    @Test
    public void hasPlayersChooseSameActionWhenActionsAreTheSameShouldTrue(){
        assertTrue(judge.hasPlayersChooseSameAction(PAPER, PAPER));
    }

    @Test
    public void hasPlayersChooseSameActionWhenActionsAreNotTheSameShouldFalse(){
        assertFalse(judge.hasPlayersChooseSameAction(PAPER, SCISSORS));
    }

    @Test
    public void isPlayerActionPaperWhenActionIsPaperShouldReturnTrue(){
        assertTrue(judge.isPlayerActionPaper(PAPER));
    }

    @Test
    public void isPlayerActionPaperWhenActionIsRockShouldReturnFalse(){
        assertFalse(judge.isPlayerActionPaper(ROCK));
    }

    @Test
    public void isPlayerActionPaperWhenActionIsScissorsShouldReturnFalse(){
        assertFalse(judge.isPlayerActionPaper(SCISSORS));
    }

    @Test
    public void isPlayerActionRockWhenActionIsPaperShouldReturnFalse(){
        assertFalse(judge.isPlayerActionRock(PAPER));
    }

    @Test
    public void isPlayerActionRockWhenActionIsRockShouldReturnTrue(){
        assertTrue(judge.isPlayerActionRock(ROCK));
    }

    @Test
    public void isPlayerActionRockWhenActionIsScissorsShouldReturnFalse(){
        assertFalse(judge.isPlayerActionRock(SCISSORS));
    }

    @Test
    public void isPlayerActionScissorsWhenActionIsPaperShouldReturnFalse(){
        assertFalse(judge.isPlayerActionScissors(PAPER));
    }

    @Test
    public void isPlayerActionScissorsWhenActionIsRockShouldReturnFalse(){
        assertFalse(judge.isPlayerActionScissors(ROCK));
    }

    @Test
    public void isPlayerActionScissorsWhenActionIsScissorsShouldReturnTrue(){
        assertTrue(judge.isPlayerActionScissors(SCISSORS));
    }

    @Test
    public void applyRulesToDecideWinnerWhenBothPlayersChosePaperThenShouldReturnDraw(){
        playerOne.setAction(PAPER);
        playerTwo.setAction(PAPER);
        String result = judge.applyRulesToDecideWinner(playerOne, playerTwo);
        assertEquals(DRAW, result);
    }

    @Test
    public void applyRulesToDecideWinnerWhenPlayerOneChosePaperAndPlayerTwoChoseRockThenPlayerOneShouldWin(){
        playerOne.setAction(PAPER);
        playerTwo.setAction(ROCK);
        String result = judge.applyRulesToDecideWinner(playerOne, playerTwo);
        assertEquals(PLAYER_1_WINNER, result);
    }

    @Test
    public void applyRulesToDecideWinnerWhenPlayerOneChosePaperAndPlayerTwoChoseScissorsThenPlayerTwoShouldWin(){
        playerOne.setAction(PAPER);
        playerTwo.setAction(SCISSORS);
        String result = judge.applyRulesToDecideWinner(playerOne, playerTwo);
        assertEquals(PLAYER_2_WINNER, result);
    }

    @Test
    public void applyRulesToDecideWinnerWhenBothPlayersChoseRockThenShouldReturnDraw(){
        playerOne.setAction(ROCK);
        playerTwo.setAction(ROCK);
        String result = judge.applyRulesToDecideWinner(playerOne, playerTwo);
        assertEquals(DRAW, result);
    }

    @Test
    public void applyRulesToDecideWinnerWhenPlayerOneChoseRockAndPlayerTwoChosePaperThenPlayerTwoShouldWin(){
        playerOne.setAction(ROCK);
        playerTwo.setAction(PAPER);
        String result = judge.applyRulesToDecideWinner(playerOne, playerTwo);
        assertEquals(PLAYER_2_WINNER, result);
    }

    @Test
    public void applyRulesToDecideWinnerWhenPlayerOneChoseRockAndPlayerTwoChoseScissorsThenPlayerOneShouldWin(){
        playerOne.setAction(ROCK);
        playerTwo.setAction(SCISSORS);
        String result = judge.applyRulesToDecideWinner(playerOne, playerTwo);
        assertEquals(PLAYER_1_WINNER, result);
    }

    @Test
    public void applyRulesToDecideWinnerWhenBothPlayersChoseScissorsThenShouldReturnDraw(){
        playerOne.setAction(SCISSORS);
        playerTwo.setAction(SCISSORS);
        String result = judge.applyRulesToDecideWinner(playerOne, playerTwo);
        assertEquals(DRAW, result);
    }

    @Test
    public void applyRulesToDecideWinnerWhenPlayerOneChoseScissorsAndPlayerTwoChosePaperThenPlayerOneShouldWin(){
        playerOne.setAction(SCISSORS);
        playerTwo.setAction(PAPER);
        String result = judge.applyRulesToDecideWinner(playerOne, playerTwo);
        assertEquals(PLAYER_1_WINNER, result);
    }

    @Test
    public void applyRulesToDecideWinnerWhenPlayerOneChoseScissorsAndPlayerTwoChoseRockThenPlayerTwoShouldWin(){
        playerOne.setAction(SCISSORS);
        playerTwo.setAction(ROCK);
        String result = judge.applyRulesToDecideWinner(playerOne, playerTwo);
        assertEquals(PLAYER_2_WINNER, result);
    }
}
