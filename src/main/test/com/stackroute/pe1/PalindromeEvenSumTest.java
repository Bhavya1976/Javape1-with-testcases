package main.test.com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import main.java.com.stackroute.pe1.PalindromeEvenSum;

public class PalindromeEvenSumTest {
    PalindromeEvenSum sum;
    @Before
    public void setUp(){

        sum = new PalindromeEvenSum();
    }
    @After
    public void tearDown() {
        sum = null;
    }
    @Test
    public  void givenNumberShouldReturnNotAPalidromMessage(){
        //arrange

        //Act
        String result = sum.CheckingPalindrome(12345);

        //Assert
        assertEquals("12345 is not palindrome",result);
    }

    @Test
    public  void givenNumberShouldReturnNumberIsPalidromAndEvenSumIsMoreThan25Message(){
        //arrange

        //Act
        String result = sum.CheckingPalindrome(2468642);

        //Assert
        assertEquals("2468642 is palindrome and the sum of even numbers is greater than 25",result);
    }

    @Test
    public  void givenNumberShouldReturnNumberIsPalidromAndEvenSumIsLessThan25Message(){
        //arrange

        //Act
        String result = sum.CheckingPalindrome(234565432);

        //Assert
        assertEquals("234565432 is palindrome and sum of even numbers is less than 25",result);
    }
    @Test
    public void givenNumberShouldReturnErrorMessage(){
        String result = sum.CheckingPalindrome(0);
        assertEquals("0 is palindrome and sum of even numbers is less than 25",result);
    }

}