package main.test.com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import main.java.com.stackroute.pe1.SortAndSumNumber;
public class SortAndSumNumberTest {
    SortAndSumNumber sort;
    @Before
    public void setUp(){

        sort=new SortAndSumNumber();
    }
    @After
    public void tearDown(){

        sort=null;
    }
    @Test
    public void givenNumberShouldReturnSortSumAndLimitMessage(){
        //Arrange
        //Act
        SortAndSumNumber.Result result=sort.sort(3456);
        //Assert
        assertEquals("Sorted number in non-increasing order 6543",result);
        assertEquals("Sum of even numbers 10",result);
        assertEquals(false,result);
    }
    @Test
    public void givenNumberAndStringShouldReturnSortSumAndLimitMessage(){
        //Arrange
        //Act
        SortAndSumNumber.Result result=sort.sort(-3652);
        //Assert
        assertEquals("Sorted number in non-increasing order 0",result);
        assertEquals("Sum of even numbers 0",result);
        assertEquals(false,result);
    }
    @Test
    public void givenNumberZeroShouldReturnSortSumAndLimitMessage(){
        //Arrange
        //Act
        SortAndSumNumber.Result result=sort.sort(0);
        //Assert
        assertEquals("Sorted number in non-increasing order 0",result);
        assertEquals("Sum of even numbers 0",result);
        assertEquals(false,result);
    }
}