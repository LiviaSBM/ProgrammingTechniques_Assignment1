import java.util.Scanner;

public class BenNumber {

    public static int benNumber(int stnumber, int totalnumbers){ //method for initializing the ben number process

        int bnumber = stnumber+1; //creation of ben number variable, with first increment +1, given it starts with odd intex =1
        int temporarynumber = bnumber; //creation of temporary number variable for incrementing ben number
        int i = 1; //setting initial index to 1 for recursive loop as per specified by question
        //System.out.print(temporarynumber+" "+"["+i+"], "); //printing test
        return increment_ben_number(bnumber, totalnumbers-1, i+1, temporarynumber*2); //calling next method with increment according to the question (*2 for even number)
    }

    public static int increment_ben_number(int bnumber, int totalnumbers, int i, int temporarynumber) {
        if (totalnumbers==0){
            return bnumber; //if the recursiveness gets to totalnumbers=0, finish loop
        } else if (i%2==0){ //if the index is even...
            bnumber += temporarynumber; //increment bnumber
            //System.out.print(temporarynumber+" "+"["+i+"], "); //printing test
            return increment_ben_number(bnumber, totalnumbers-1, i+1, temporarynumber+1); //run recursiveness
        } else { //if i is not even, nor 0
            bnumber += temporarynumber; //increment bnumber
            //System.out.print(temporarynumber+" "+"["+i+"], "); //printing test
            return increment_ben_number(bnumber, totalnumbers-1, i+1, temporarynumber*2); //run recursiveness
        }

    }


    public static int positiveOnly(int stnumber, int totalnumbers){ //Method for requesting a positive only entry
        if (stnumber>0 && totalnumbers >0){
            return benNumber(stnumber,totalnumbers); //if initial user's input is positive, nothing to be done - move to the next method benNumber
        } else if (stnumber<=0) {
            Scanner myObj = new Scanner(System.in);
            System.out.println("Invalid entry for the starting number. Please enter starting number greater than zero: "); //Else, repetidly request a new input until the user entries a positive number for the starting number
            stnumber = myObj.nextInt();
            return positiveOnly(stnumber,totalnumbers); //run recursivity
        } else if (totalnumbers<=0){
            Scanner myObj = new Scanner(System.in);
            System.out.println("Invalid entry for the quantity. Please enter a quantity greater than zero: "); //likewise, if quantity <= 0, repetidly request a new input until the user entries a positive number for the quantity
            totalnumbers = myObj.nextInt();
            return positiveOnly(stnumber,totalnumbers); //run recursivity
        }
        return positiveOnly(stnumber,totalnumbers);
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); //myObj for receiving user's input
        System.out.println("Enter starting number greater than zero: "); //asking the user to enter the starting number
        int startingnumber = myObj.nextInt(); //saving user's answer into a variable
        System.out.println("How many numbers would you like to print? (Quantity must be greater than 0"); //same with quantity of numbers
        int totalnumbers = myObj.nextInt(); //quantity variable

        System.out.println("The Ben Number is: "+positiveOnly(startingnumber, totalnumbers)); //calling the positiveOnly method, that will check if entries are positive, run itself recursively if necessary, then call the next methods
    }
}
