//Student: Livia Menezes
//Student ID: 261066016

import java.util.Random; 
import java.util.Scanner;
public class CrazySeries {

    public static String crazy_Series(int stnumber){

        int size = stnumber%3;
        size= (((stnumber-size)/3)*2)+3;

        int[] myArr = new int[size];
        myArr[0] = stnumber;
        int i = 1;
        System.out.print("["+stnumber+", ");
  
        return buildArray(myArr, stnumber-3, size-1, i);
    }

    public static String buildArray(int[] myArr, int stnumber, int size, int i) {
        if (size==0){
            return "]"; //TROCAR E BOTAR PRA CHAMAR O PROXIMO METODO
        } else if (size==1){
            System.out.print(stnumber);
            return buildArray(myArr, stnumber+3, size-1, i+1);
        } else if (stnumber<0 || myArr[i-1]<stnumber){
            myArr[i] = stnumber;
            System.out.print(stnumber+", ");
            return buildArray(myArr, stnumber+3, size-1, i+1);
        } else if (myArr[i-1]>=0 && myArr[i-1]>stnumber) {
            myArr[i] = stnumber;
            System.out.print(stnumber+", ");
            return buildArray(myArr, stnumber-3, size-1, i+1);
        }

        return "]";

        
    }


    public static void main(String[] args) throws Exception {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the starting number: ");
        int startingnumber = myObj.nextInt();


        System.out.println(crazy_Series(startingnumber));
        



    }
}