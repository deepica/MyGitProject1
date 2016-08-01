import java.util.Scanner;

public class InsertionSort {
	
	public static void main(String[] Args) {
		
		System.out.println("Enter the numbers into array");
		Scanner s = new Scanner(System.in);
		int arr[] = new int[10];
		int a=0;
		
		for(int i = 0;i<10;i++){
			
			arr[i] = s.nextInt();
		}
		print(arr);
		ISort(arr);
		print(arr);
	}
	public static void ISort(int[] arr) {
		
		for(int i =1;i<arr.length;i++){
		int key = arr[i];
		int j= i-1;
			while(j>=0 && arr[j]>key){
				arr[j+1] = arr[j];
				j--;	
			}
			arr[j+1] = key;		
		}
		
	}
	public static void print(int[] arr) {
		
		for(int i = 0;i<10;i++)
			{System.out.print(arr[i]+ " ");}
		
	}

}
