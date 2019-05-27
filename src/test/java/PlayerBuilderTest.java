import org.junit.Test;

import static label.Action.PAPER;
import static label.Action.ROCK;
import static label.Action.SCISSORS;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PlayerBuilderTest {

    @Test
    public void isValidActionWhenActionIsPaperThenShouldReturnTrue(){
        assertTrue(PlayerBuilder.isValidAction(PAPER));
    }

    @Test
    public void isValidActionWhenActionIsRockThenShouldReturnTrue(){
        assertTrue(PlayerBuilder.isValidAction(ROCK));
    }

    @Test
    public void isValidActionWhenActionIsScissorsThenShouldReturnTrue(){
        assertTrue(PlayerBuilder.isValidAction(SCISSORS));
    }

    @Test
    public void isValidActionWhenActionValueIsNineThenShouldReturnFalse(){
        assertFalse(PlayerBuilder.isValidAction(9));
    }
}
