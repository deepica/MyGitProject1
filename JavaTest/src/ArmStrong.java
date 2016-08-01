import java.util.Scanner;

public class ArmStrong {
	
    public static void main(String a[]){
    	
        ArmStrong n = new ArmStrong();
        Scanner s = new Scanner(System.in);
        
        int n1 = s.nextInt();
        System.out.println(n.isArmstrongNumber(n1));
        
    }

	public boolean isArmstrongNumber(int number){
        
        int tmp = number;
        int noOfDigits = String.valueOf(number).length();
        int sum = 0;
        int div = 0;
        while(tmp > 0)
        {
            div = tmp % 10;
            int temp = 1;
            for(int i=0;i<noOfDigits;i++){
                temp *= div;
            }
            sum += temp;
            tmp = tmp/10;
        }
        if(number == sum) {
            return true;
        } else {
            return false;
        }
    }
}
