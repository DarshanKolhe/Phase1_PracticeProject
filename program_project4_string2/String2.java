package program_project4_string2;
import java.util.Scanner;

public class String2 {

	public static void main(String[] args) {
		  Scanner input = new Scanner(System.in);
	       System.out.println("Enter a sentence:");
	       String str = input.nextLine();
	       String word = "" + str.charAt(0);
	       int len = str.length();
	       
	       for (int i = 0; i < len; i++) {
	           char ch = str.charAt(i);
	           if (ch == ' ')
	               word=word+ str.charAt(i + 1);
	       }
	       
	       System.out.println(word);
	    }
	}


