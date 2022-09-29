import java.util.ArrayList;

//Student: Livia Menezes
//Student ID: 261066016
public class A1 {

	public static void main(String[] args) {

		System.out.println(crazySeries(5));
		System.out.println(crazySeries(9));
		
		System.out.println(benNumber(2,5));
		System.out.println(benNumber(3,8));
		System.out.println(benNumber(1,1));
		
		//TODO you can add more test cases here

	}


	//Q1
	//public static ArrayList<Integer> crazySeries(int start) {
		//TODO write your code in this method.
	//	ArrayList<Integer> answer = new ArrayList<>();
	//	return answer;
	//}

	public static String crazySeries(int stnumber){ //method for initializing the process of building the array

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

	
	
	//Q2
	//public static int benNumber(int m, int n) {
		//TODO write your code in this method.
	//	int answer = 0;
	//	return answer;
	//}


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

}
