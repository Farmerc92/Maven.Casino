package io.zipcoder.casino.Game;

import io.zipcoder.casino.player.Player;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CrapsTest {

    Player expectedUser;
    Craps testCraps;
    Integer expectedBet;

    @Before
    public void init(){
        expectedUser = new Player();
        testCraps = new Craps(expectedUser);
        expectedBet = 20;
    }

    @Test
    public void constructorTest(){
        Boolean expectedIsPoint = false;
        Boolean actualIsPoint = testCraps.getIsPointOn();

        assertEquals(expectedIsPoint, actualIsPoint);
    }

    @Test
    public void setGetComeBetsTest(){
        testCraps.setComeBets(4, expectedBet);

        Integer actualBet = testCraps.getComeBets(4);

        assertEquals(expectedBet, actualBet);
    }

    @Test
    public void setGetDontComeBetsTest(){
        testCraps.setDontComeBets(6, expectedBet);

        Integer actualBet = testCraps.getDontComeBets(6);

        assertEquals(expectedBet, actualBet);
    }

    @Test
    public void setGetPassLineTest(){
        testCraps.setPassLine(expectedBet);

        Integer actualBet = testCraps.getPassLine();

        assertEquals(expectedBet, actualBet);
    }

    @Test
    public void setGetDontPassLineTest(){
        testCraps.setDontPassLine(expectedBet);

        Integer actualBet = testCraps.getDontPassLine();

        assertEquals(expectedBet, actualBet);
    }

    @Test
    public void setGetComeBetTest(){
        testCraps.setCome(expectedBet);

        Integer actualBet = testCraps.getCome();

        assertEquals(expectedBet, actualBet);
    }

    @Test
    public void setGetDontComeTest(){
        testCraps.setDontCome(expectedBet);

        Integer actualBet = testCraps.getDontCome();

        assertEquals(expectedBet, actualBet);
    }

    @Test
    public void setGetFieldTest(){
        testCraps.setField(expectedBet);

        Integer actualBet = testCraps.getField();

        assertEquals(expectedBet, actualBet);
    }

    @Test
    public void setGetCurrentPoint(){
        Integer expectedCurrentPoint = 6;
        testCraps.setCurrentPoint(expectedCurrentPoint);

        Integer actualCurrent = testCraps.getCurrentPoint();

        assertEquals(expectedCurrentPoint, actualCurrent);
    }
}