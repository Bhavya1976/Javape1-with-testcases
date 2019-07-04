package main.test.com.stackroute.pe1;

import main.java.com.stackroute.pe1.GuessNumber;
import org.junit.*;

import static org.junit.Assert.assertEquals;

public class GuessNumberTest {
    GuessNumber check;
    @Before
    public void setUp(){

        check=new GuessNumber();
    }
    @After
    public void tearDown()
    {

        check=null;
    }

    @Test
    public void givenNumberShouldReturnGuessedNumberIsLessThanOriginalNumberMessage(){
        //arrange


        //act
        String result=check.numberGuess(3,19);

        //assert
        assertEquals("Number Guessed is less than original Number",result);
    }

    @Test
    public void givenNumberShouldReturnGuessedNumberIsGreaterThanOriginalNumberMessage(){
        //arrange

        //act
        String result=check.numberGuess(20,10);

        //assert
        assertEquals("Number Guessed is more than original Number",result);
    }

    @Test
    public void givenNumberShouldReturnGuessNumberIsEqualsToOriginalNumberMessage(){
        //arrange

        //act
        String  result=check.numberGuess(29,29);

        //assert
        assertEquals("Number Guessed matches the original number",result);
    }




}
