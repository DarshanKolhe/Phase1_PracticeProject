package program_project3_string1;
import java.util.Scanner;


public class String1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your sentence :");
		String str = input.nextLine();
		System.out.println(str.toUpperCase());
		
		 int counter = 0;
	        int len = str.length();
	        
	        for (int i = 0; i < len - 1; i++) {
	            if (str.charAt(i) == str.charAt(i + 1))
	                counter++;
	        }
	        
	        System.out.println("Same Letter Sequence Count in string = " + counter);
	        
	    }
		
		
	}


