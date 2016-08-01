import java.io.*;
import java.util.*;
public class MulWoOp{
	
        public static void main(String args[])throws IOException{
        	
        System.out.println("Enter the first number");
        Scanner s = new Scanner(System.in);
        
        int a=s.nextInt();
        System.out.println("Enter the Second number");
        int b=s.nextInt();
        
        mul(a, b);
        }
   public static void mul(int num1, int num2) {
	

        int c=0;
        for(int i=0;i<num2;i++){
                c=c+num1;
        }
        System.out.println("The Product is"+c);
   }
}
