package program_project5_calculator;
import java.util.Scanner;

class Arithmatic_Operations{
	int addition(int a, int b){
		return a+b;
	}
	int substraction(int a, int b){
		return a-b;
	}
	int multiplication(int a, int b){
		return a*b;
	}
	int division(int a, int b){
		return a/b;
	}
}

public class Calculator {

	public static void main(String[] args) {
		Arithmatic_Operations myObj= new Arithmatic_Operations();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first number :");
		int num1 = input.nextInt();
		System.out.println("Enter second number :");
		int num2 = input.nextInt();
		System.out.println("Select option number to perform arithmatic operation  :\n1. Addition\n2. Substraction\n"
				+ "3. Multiplication\n4. Division");
		
		System.out.println("Enter your choice");
		int num3 = input.nextInt();
		
		if(num3==1){
			int s1= myObj.addition(num1,num2);
			System.out.println("Addition of "+num1+" and "+num2+ "is :"+s1);
		}else if(num3==2){
			int s2= myObj.substraction(num1,num2);
			System.out.println("Substraction of "+num1+" and "+num2+ "is :"+s2);
		}else if(num3==3){
			int s3= myObj.multiplication(num1,num2);
			System.out.println("Multiplication of "+num1+" and "+num2+ "is :"+s3);
		}else if(num3==4){
			int s4= myObj.division(num1,num2);
			System.out.println("Division of "+num1+" and "+num2+ "is :"+s4);
		}else{
			System.out.println("Wrong option choose..");

		}

		
		
	}

}
