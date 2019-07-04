// program for generation and addition of random numbers

package main.java.com.stackroute.pe1;

import java.util.Random;
import java.util.Scanner;
import java.lang.Class;



public class SumOfArray{

    public static int sumOfArray(){

        int sum=0;

        int array[] = {1,2,3,10,33};

        for(int i = 0; i < array.length; i++)
        {
            sum = sum + array[i];
        }

        return sum;
    }


}