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
    public void givenNumberShouldReturnSortAndSumOfNumber(){
       int result = sort.arraySorting();
       assertEquals(sort.arraySorting(),result);
    }
    @Test
    public void givenNumberAndStringShouldReturnBooleanMessage() {
        int res = sort.arraySorting();
        boolean result = sort.isBoolean(res);
        assertEquals(false,result);
    }

}