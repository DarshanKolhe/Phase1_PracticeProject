package assisted_project_no8_program;

public class innerClassAssisted2 {
	

		private String msg="Inner Classes";

		 void display(){  
			 class Inner{  
				 void msg(){
					 System.out.println(msg);
				 }  
		  }  
		  
		  Inner l=new Inner();  
		  l.msg();  
		 }  

		 
		public static void main(String[] args) {
			innerClassAssisted2  ob=new innerClassAssisted2 ();  
			ob.display();  
			}
		

}
