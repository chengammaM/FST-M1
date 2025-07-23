package activities;

import java.util.Arrays;

public class Activity2 {
	
	
	public static void main(String[] args) {
		//Initialize an array with 6 number: [10, 77, 10, 54, -11, 10]	
		int searchNum=10;
		int expSum=30;
		int[] numbers= {10, 77, 10, 54, -11, 10};
	System.out.println("Original array is" + Arrays.toString(numbers));	
	
    System.out.println("result is : " + sumofSearchedNumber(numbers,searchNum,expSum));
	
			
	}
		// TODO Auto-generated method stub
	
	public static boolean sumofSearchedNumber(int[] numbers,int searchNum, int expSum) {
	
int sum=0;
//Find the 10's in the array and add them
for(int num:numbers) {
	if(num==searchNum) {
		sum=sum+num;	
	}
}
//Check if value is equal to 30.

return sum == expSum;

	}
	

}
