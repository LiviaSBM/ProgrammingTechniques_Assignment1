import java.util.Scanner;

public class BenNumber {

    public static int benNumber(int stnumber, int totalnumbers){ //method for initializing the process of building the array

        int bnumber = stnumber+1;
        int temporarynumber = bnumber;
        int i = 1; //setting initial index to 1 for recursive loop as per specified by question
        System.out.print(temporarynumber+" "+"["+i+"], ");
        return buildArray(bnumber, totalnumbers-1, i+1, temporarynumber*2); 
    }

    public static int buildArray(int bnumber, int totalnumbers, int i, int temporarynumber) {
        if (totalnumbers==0){
            return bnumber; //if the recursiveness gets to totalnumbers=0, finish loop
        } else if (i%2==0){ 
            bnumber += temporarynumber;
            System.out.print(temporarynumber+" "+"["+i+"], ");
            return buildArray(bnumber, totalnumbers-1, i+1, temporarynumber+1); //calling buildArray method again
        } else { 
            bnumber += temporarynumber;
            System.out.print(temporarynumber+" "+"["+i+"], ");
            return buildArray(bnumber, totalnumbers-1, i+1, temporarynumber*2); //calling buildArray method again
        }

    }


    public static int positiveOnly(int stnumber, int totalnumbers){ //Method for requesting a positive only entry
        if (stnumber>0 && totalnumbers >0){
            return benNumber(stnumber,totalnumbers); //if initial user's input is positive, nothing to be done - move to the next method crazy_Series
        } else if (stnumber<=0) {
            Scanner myObj = new Scanner(System.in);
            System.out.println("Invalid entry. Please enter starting number greater than zero: "); //Else, repetidly request a new input until the user entries a positive number
            stnumber = myObj.nextInt();
            return positiveOnly(stnumber,totalnumbers);
        } else if (totalnumbers<=0){
            Scanner myObj = new Scanner(System.in);
            System.out.println("Invalid entry. Please enter a quantity greater than zero: "); //Else, repetidly request a new input until the user entries a positive number
            totalnumbers = myObj.nextInt();
            return positiveOnly(stnumber,totalnumbers);
        }
        return positiveOnly(stnumber,totalnumbers);
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); //myObj for receiving user's input
        System.out.println("Enter starting number greater than zero: ");
        int startingnumber = myObj.nextInt(); 
        System.out.println("How many numbers would you like to print? (Quantity must be greater than 0");
        int totalnumbers = myObj.nextInt(); 

        System.out.println("The Ben Number is: "+positiveOnly(startingnumber, totalnumbers)); //calling the positiveOnly method, that will call the next ones
    }
}
