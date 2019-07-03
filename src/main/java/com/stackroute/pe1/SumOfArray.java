// program for generation and addition of random numbers

package main.java.com.stackroute.pe1;

import java.util.Random;
import java.util.Scanner;
import java.lang.Class;



public class SumOfArray{

    public static int sumOfArray(int number){
        int sum=0;
       // int result[];
        Scanner s = new Scanner(System.in);
        System.out.println("Enter no. of elements you want in array:");
        number= s.nextInt();
        int array[] = new int[number];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < number; i++)
        {
            array[i] = s.nextInt();
            sum = sum + array[i];
        }
       // result[] = sum;
        System.out.println("Sum:"+sum);

    return sum;

    }


}