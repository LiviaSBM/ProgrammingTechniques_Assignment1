//Student: Livia Menezes
//Student ID: 261066016

import java.util.Random; 
import java.util.Scanner;
public class CrazySeries {

    public static String crazy_Series(int stnumber){ //method for initializing the process of building the array

        int size = stnumber%3; //defining the size of the array
        size= (((stnumber-size)/3)*2)+3; //this calculation gets us the lenght of the array according to the starting number provided by the user

        int[] myArr = new int[size]; //creating the array
        myArr[0] = stnumber; //setting the first number as the starting number provided by the user
        int i = 1; //setting initial index to 1 for recursive loop
        System.out.print("["+stnumber+", "); //printing the beginning of the array
  
        return buildArray(myArr, stnumber-3, size-1, i); //calling recursive method for building the rest of the array - note that the starting number is already being reduced by 3, and the array lenght (size) by 1
    }

    public static String buildArray(int[] myArr, int stnumber, int size, int i) {
        if (size==0){
            return "]"; //if the recursiveness gets to size=0, finish loop
        } else if (size==1){
            System.out.print(stnumber); //if the recursiveness gets to the last item, print the number
            return buildArray(myArr, stnumber+3, size-1, i+1); //calling buildArray method again
        } else if (stnumber<0 || myArr[i-1]<stnumber){ //if the recursiveness reaches the negative number, start summing up +3 to the number and reducing 1 from the size
            myArr[i] = stnumber;
            System.out.print(stnumber+", ");
            return buildArray(myArr, stnumber+3, size-1, i+1); //calling buildArray method again
        } else if (myArr[i-1]>=0 && myArr[i-1]>stnumber) { //if the recursiveness is yet on the initial positive numbers, keep decreasing 3 from the current number and reducing 1 from the size
            myArr[i] = stnumber;
            System.out.print(stnumber+", ");
            return buildArray(myArr, stnumber-3, size-1, i+1); //calling buildArray method again
        }

        return "]";        
    }

    public static String positiveOnly(int stnumber){ //Method for requesting a positive only entry
        if (stnumber>0){
            return crazy_Series(stnumber); //if initial user's input is positive, nothing to be done - move to the next method crazy_Series
        } else {
            Scanner myObj = new Scanner(System.in);
            System.out.println("Invalid entry. Please enter starting number greater than zero: "); //Else, repetidly request a new input until the user entries a positive number
            stnumber = myObj.nextInt();
            return positiveOnly(stnumber);
        }
    }


    public static void main(String[] args){ //Main
        Scanner myObj = new Scanner(System.in); //myObj for receiving user's input
        System.out.println("Enter starting number greater than zero: ");
        int startingnumber = myObj.nextInt(); //recording user's input


        System.out.println(positiveOnly(startingnumber)); //calling the positiveOnly method, that will call the next ones
        



    }
}