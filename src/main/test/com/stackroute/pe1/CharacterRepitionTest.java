package main.test.com.stackroute.pe1;

import main.java.com.stackroute.pe1.CharacterRepition;
import org.junit.*;

import static org.junit.Assert.*;

public class CharacterRepitionTest {

        CharacterRepition repeat;
        @Before
        public void setUp(){
            //System.out.println("Before");
            repeat = new CharacterRepition();
        }
        @After
        public void tearDown()
        {
           // System.out.println("After");
            repeat = null;
        }
        @BeforeClass
        public static void setUpBeforeClass(){
        }
        @AfterClass
        public static void tearDownAfterClass()
        {
        }
        @Test
        public void givenOneStringOneNumberShouldReturnResultMessage(){
            //arrange


            //act
            String result=repeat.repeatSubstring(" Bhavya",2);

            //assert
            assertEquals("Bhavyayaya",result);
        }

        @Test
        public void givenOneStringContainOneCharOneNumberShouldReturnResultMessage(){
            //arrange

            //act
            String result = repeat.repeatSubstring(" ya",5);

            //assert
            assertEquals("papapapapapa",result);
        }

        @Test
        public void  givenOneStringOneNegativeNumberShouldReturnResultMessage(){
            //arrange

            //act
            String result=repeat.repeatSubstring("Bhavya ",-7);

            //assert
            assertEquals("Tom",result);
        }






}
