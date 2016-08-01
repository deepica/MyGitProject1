import java.util.Scanner;

public class Fibonacci {
	
	public static void main(String[] Args) {
		
		System.out.println("Enter a number");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		
		for(int i=0;i<a;i++)
			
			System.out.println("The fibonacci series is:" +fib(i)+ " ");
	}
	public static int fib(int num) {
		
		if (num==0 || num==1)
		{
			return 1;
		}
			return (fib(num-1) + fib(num-2));
			
		}
		
	}