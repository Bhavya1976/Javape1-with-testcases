package main.test.com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import main.java.com.stackroute.pe1.ReverseOfString;

public class ReverseOfStringTest {
    ReverseOfString reverse;
    @Before
    public void setUp(){

        reverse = new ReverseOfString();
    }
    @After
    public void tearDown(){

        reverse=null;
    }
    @Test
    public void givenStringShouldReturnReverseStringMessage(){
        //Arrange
        //Act
        String result=reverse.reverseString("london");
        //Assert
        assertEquals("reverse string is:nodnol",result);
    }
    @Test
    public void givenStringShouldReturnSringMessage(){
        //Arrange
        //Act
        String result=reverse.reverseString("lon3don");
        //Assert
        assertEquals("reverse string is:nod3nol",result);
    }
    @Test
    public void givenNumericStringShouldReturnReverseStringMessage(){
        //Arrange
        //Act
        String result=reverse.reverseString("12345");
        //Assert
        assertEquals("reverse string is:54321",result);
    }
    @Test
    public void givenNullStringShouldReturnReverseStringMessage(){
        //Arrange
        //Act
        String result=reverse.reverseString("");
        //Assert
        assertEquals("reverse string is:",result);
    }
}