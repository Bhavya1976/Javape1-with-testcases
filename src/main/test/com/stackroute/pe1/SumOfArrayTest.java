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
    public void givenNumberShouldReturnSumOfArrayMessage(){
        //Arrange
        //Act
        int result=add.sumOfArray();
        //Assert
        assertEquals(49,result);
    }
}