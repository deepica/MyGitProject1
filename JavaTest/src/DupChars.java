import java.util.Scanner;

public class DupChars {

	public static void main(String[] Args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = s.nextLine();
		
		DupChar(str);
		
	}
	public static void DupChar(String str) {
		
		for (int i = 0; i<=str.length();i++)
		{
			for (int j = str.length()-1; j >0; j--) 
			{
				char key = str.charAt(j);
				if(str.charAt(i) == key)
				{
					System.out.println("found duplicate: " +str.charAt(i)+ " at " +i);
				}	
				j--;
			
		}
			i++;
			
		}
	}
}
		/*int distinct = 0 ;

	    for (int i = 0; i < s.length(); i++) {

	        for (int j = 0; j < s.length(); j++) {

	            if(s.charAt(i)==s.charAt(j))
	            {
	                distinct++;

	            }
	        }   
	        System.out.println(s.charAt(i)+"--"+distinct);
	        String d=String.valueOf(s.charAt(i));
	        s=s.replaceAll(d,"");
	        distinct = 0;

	    }*/
		
	

