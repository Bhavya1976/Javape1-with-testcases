package main.test.com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import main.java.com.stackroute.pe1.SumOfArray;


public class SumOfArrayTest{
    SumOfArray add;
    @Before
    public void setUp(){
        add = new SumOfArray();
    }
    @After
    public void tearDown(){

        add = null;
    }
    @Test
    public void givenNumberShouldPrintRandomNumberSumMessage(){
        //Arrange
        //Act
        int result=add.sumOfArray( 10 );
        //Assert
        assertEquals("  ",result);
    }
    @Test
    public void givenNumberShouldReturnIndexOutOfRangeMessage(){
        //Arrange
        //Act
        int  result=add.sumOfArray(11);
        //Assert
        assertEquals(" ",result);
    }
    @Test
    public void givenNumberShouldReturnNullMessage(){
        //Arrange
        //Act
       int result=add.sumOfArray( 0);
        //Assert
        assertEquals(" ",result);
    }

}