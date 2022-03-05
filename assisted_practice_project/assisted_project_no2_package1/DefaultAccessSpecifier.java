package assisted_project_no2_package1;

public class DefaultAccessSpecifier {

	public static void main(String[] args) {
		//default
		System.out.println("Dafault Access Specifier");
		defAccessSpecifier obj = new defAccessSpecifier(); 		  
        obj.display(); 

	}
}

class defAccessSpecifier
{ 
  void display() 
     { 
         System.out.println("You are using defalut access specifier"); 
     } 
 
}



