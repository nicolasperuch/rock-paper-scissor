import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class JudgeTest {

    private Judge judge;

    @Before
    public void setUp(){
        judge = new Judge();
    }

    @Test
    public void isPlayerActionPaperWhenActionIsPaperShouldReturnTrue(){
        assertTrue(judge.isPlayerActionPaper(Actions.PAPER));
    }

    @Test
    public void isPlayerActionPaperWhenActionIsRockShouldReturnFalse(){
        assertFalse(judge.isPlayerActionPaper(Actions.ROCK));
    }

    @Test
    public void isPlayerActionPaperWhenActionIsScissorsShouldReturnFalse(){
        assertFalse(judge.isPlayerActionPaper(Actions.SCISSORS));
    }
}
