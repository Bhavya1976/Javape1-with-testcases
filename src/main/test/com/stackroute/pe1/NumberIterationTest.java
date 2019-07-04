package main.test.com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import main.java.com.stackroute.pe1.NumberIteration;

public class NumberIterationTest {

    NumberIteration iterate;
    @Before
    public void setUp(){
        iterate = new NumberIteration();
    }
    @After
    public void teamDown(){
        iterate=null;
    }
    @Test
    public void givenNumberShouldReturnNumberRepeatMessage(){
        //Arrange
        //Act
        String result=iterate.iteratnumber(2);
        //Assert
        assertEquals("1 2 2",result);
    }
    @Test
    public void givenNumberShouldReturnNoMessageReturn(){
        //Arrange
        //Act
        String result=iterate.iteratnumber(0);
        //Assert
        assertEquals("",result);
    }
    @Test
    public void givenNumberShouldReturnMessageReturn(){
        //Arrange
        //Act
        String result=iterate.iteratnumber(-1);
        //Assert
        assertEquals("",result);
    }

}