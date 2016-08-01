import java.util.Scanner;

public class DivWoOP {
	
	public static void main(String[] Args) {
		
		System.out.println("Enter the number to be divided");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		//Divbytwo(a);
		DivByTwo(a);
		
	}
	
	public static void Divbytwo(int num) {
		
		int divby = 2;	
		double rem = 0;
		
		while(num>=divby)
		{
				num = num - divby;
				rem++;
		}
		System.out.println(rem);
		
	}
	public static void DivByTwo(int num) {
		
		int divby =2;
		int quotient = 0;
		int currentQuotient = 1;
		
		while(num >= divby)
		{
			if(num>divby)
			{
				num = num -divby;
				quotient = quotient+ currentQuotient;
				divby = divby*2;
				currentQuotient = currentQuotient*2;
			}
			else if (num <=divby)
			{
				divby = divby/2;
				currentQuotient = currentQuotient/2;
			}
			
		}
		System.out.println(currentQuotient);
		
	}

}
