package program_project6_EmailValidation;

import java.util.Arrays;
import java.util.Scanner;

public class EmailValidation {
	public static void main(String[] args){
	String[] arr = new String[5];
	arr[0] = "darshankolhe@gmail.com";
	arr[1] = "ganeshwaman@gmail.com";
	arr[2] = "sahiljain@gmail.com";
	arr[3] = "vyom@gmail.com";
	arr[4] = "prakash123@gmail.com";
	
	Scanner input = new Scanner(System.in);
	System.out.println("Enter your email :");
	String str = input.nextLine();
	String toFind= str;
	
	boolean found = Arrays.stream(arr).anyMatch(t -> t.equals(toFind));

    if(found)
      System.out.println(toFind + " is valid.");
    else
      System.out.println(toFind + " is not valid.");
  }

	
  }
  


//------------------Email Validation using regex----------------------//
/*
import java.util.*;
import java.util.regex.*;
public class EmailValidation {
public static void main(String[] args) {

List<String> emails = new ArrayList<String>();
// valid email addresses 
 emails.add("darshankolhe@gmail.com"); 
 emails.add("ganeshwaman@gmail.com"); 
 emails.add("vyom@gmail.com");
 
//invalid email addresses 
 emails.add("king.example.com"); 
 emails.add("pavan..bob@example.com"); 
 emails.add("srinu@.example.com");

for (String value : emails) {
System.out.println("The Email address " + value + " is " + (isValidEmail(value) ? "valid" : "invalid"));

}
System.out.println("Enter any email address to check"); Scanner sc = new Scanner(System.in);
String input = sc.nextLine();
System.out.println("The Email address " + input + " is " + (isValidEmail(input) ? "valid" : "invalid"));


}

public static boolean isValidEmail(String email) {
 String regex = "^[a-zA-z0-9+_.-]+@[a-zA-z0-9.-]+$";
//initialize the Pattern object
Pattern pattern = Pattern.compile(regex); 
Matcher matcher = pattern.matcher(email); 
return matcher.matches();


}

}
*/


