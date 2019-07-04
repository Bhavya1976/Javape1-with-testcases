package main.java.com.stackroute.pe1;
import java.util.Scanner;

public class SortAndSumNumber {
public static int arraySorting(){
    int temp,i=0,j=0;
    int sum=0;
    //Intializing the array size
    int array[] = {7,10,3,5,9};


    //For sorting the array
    for(i=0;i<array.length-1;i++){
       // for(int j=0)
        if(array[i]<array[j]) {
            temp = array[i];
            array[i]=array[j];
            array[j]=temp;
        }
    }
    for(j=0;j<array.length-1;j++) {
        if (array[i] % 2 == 0) {       //addition of even numbers
            sum = sum + array[i];

        }



    }
    return sum;

 }
    public boolean isBoolean(int res){

   boolean flag;

    if(res > 15){                    // returns the boolean as true value if the addition of even number is greater than 15
        flag = true;

    }

   else{
       flag = false;              // returns the boolean as false value if the addition of even number is less than 15
    }
   return flag;
}


}
