package main.test.com.stackroute.pe1;


import main.java.com.stackroute.pe1.CheckingEvenOrOdd;
import org.junit.*;

import static org.junit.Assert.*;

public class CheckingEvenOrOddTest {
    CheckingEvenOrOdd check;
    @Before
    public void setUp(){
        System.out.println("Before");
        check=new CheckingEvenOrOdd();
    }
    @After
    public void tearDown()
    {
        System.out.println("After");
        check=null;
    }
    @BeforeClass
    public static void setUpBeforeClass(){
    }
    @AfterClass
    public static void tearDownAfterClass()
    {
    }
    @Test
    public void givenNumberShouldReturnOutOfRangeMessage(){
        //arrange


        //act
        String result=check.checkingEvenOrOdd(33);

        //assert
        assertEquals("Entered value is out of range ",result);
    }

    @Test
    public void givenNumberShouldReturnJerryMessage(){
        //arrange

        //act
        String result=check.checkingEvenOrOdd(20);

        //assert
        assertEquals("Jerry",result);
    }

    @Test
    public void givenNumberShouldReturnTomMessage(){
        //arrange

        //act
        String result=check.checkingEvenOrOdd(69);

        //assert
        assertEquals("Tom",result);
    }



}

