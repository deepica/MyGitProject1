import java.util.Scanner;

public class MiddleIndex {

	 public static void main(String[] args) {
		 
		 	System.out.println("Enter 5 numbers:");
		 	Scanner s = new Scanner(System.in);
		 	int a[] = new int[5];
		 	
		 	for (int i=0;i<5;i++){
		 		a[i] = s.nextInt();
		 	}
	
		 	int i = findMiddleIndex(a);
		 	System.out.print("Middle index of the array when both ends sums equal:" +a[i]);
	 	}

	 public static int findMiddleIndex(int[] arr){

		 int sumArray = 0;
		 int leftSumArray=0;
		 for (int i=0; i<arr.length;i++)
		 	{
			 sumArray=sumArray+arr[i];
		 	}

		 for (int j=0; j<arr.length; j++)
		 {
			 sumArray=sumArray-arr[j];
			 if (leftSumArray==sumArray)
			 {
				 return j;
			 }
			 leftSumArray= leftSumArray+arr[j];
		 }
		 return -1;
		 }
	}