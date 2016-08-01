import java.util.Scanner;

public class RemDups {

	public static void main(String[] Args) {
		
		System.out.println("Enter the numbers into array");
		Scanner s = new Scanner(System.in);
		int arr[] = new int[5];
		int a=0;
		
		for(int i = 0;i<5;i++){
			
			arr[i] = s.nextInt();
		}
		print(arr);
		removeDuplicates(arr);
		print(arr);
	}
	
	public static int removeDuplicates(int[] A) {
		if (A.length < 2)
			return A.length;
	 
		int j = 0;
		int i = 1;
	 
		while (i < A.length) {
			if (A[i] == A[j]) {
				i++;
			} else {
				j++;
				A[j] = A[i];
				i++;
			}
		}
	 
		return j + 1;
		}
	
	public static void print(int[] arr)
	{
		for(int i = 0;i<arr.length; i++)
		{
			System.out.print(arr[i]+ " ");
		}
	}
	
}
