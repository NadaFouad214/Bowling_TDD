
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import static junit.framework.Assert.*;
public class Bowling {

    Game game;
    @Before
    public void setup(){

        game= new Game();
    }
    @Test
    public void rollZeroScoreIsZero()
    {

        game.roll(0);
        assertEquals(0,game.score());

    }
    @Test
    public void openFrameAddsPins()
    {

        game.roll(4);
        game.roll(2);
        assertEquals(6,game.score());
    }

    @Test
    public void spareAddNext()
    {
        game.roll(4);
        game.roll(6);
        game.roll(3);
        game.roll(0);
        assertEquals(16,game.score());

    }

    @Test
    public void aTenInTwoFramesIsNotAspare()
    {
        game.roll(3);
        game.roll(6);
        game.roll(4);
        game.roll(2);
        assertEquals(15,game.score());

    }

@Test
public void aStrikeAddNextTwoBalls()
{
    game.roll(10);
    game.roll(3);
    game.roll(2);
    assertEquals(20,game.score());

}

    @Test
   public void perfectGameScoreIs300() {
        game= new Game();
        for (int i=0;i<12;i++)
            game.roll(10);
        assertEquals(300,game.score());
    }
}
