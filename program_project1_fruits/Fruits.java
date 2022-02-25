package program_project1_fruits;
import java.util.Scanner;

class FruitJuice{
	//declare class variables
	int product_code;
	String flavour;
	String pack_type;
	int pack_size;
	int product_price;
	
	//constructor
	 public FruitJuice() {
	        product_code = 0;
	        flavour = "";
	        pack_type = "";
	        pack_size = 0;
	        product_price = 0;
	    }
	    
	    public void input() {
	        Scanner input = new Scanner(System.in);
	        System.out.print("Enter Flavour: ");
	        flavour = input.nextLine();
	        System.out.print("Enter Product Code: ");
	        product_code = input.nextInt();
	        System.out.print("Enter Pack Type: ");
	        pack_type = input.nextLine();
	        System.out.print("Enter Pack Size: ");
	        pack_size = input.nextInt();
	        System.out.print("Enter Product Price: ");
	        product_price = input.nextInt();
	    }
	    
	    public void discount() {
	        product_price = product_price - 10;
	    }
	    
	    public void display() {
	        System.out.println("Product Code: " + product_code+"\nFlavour: " + flavour+"\nPack Type: " + pack_type
	        		+"\nPack Size: " + pack_size+"\nProduct Price: " + product_price);
	       
	    }
	
}

public class Fruits {

	public static void main(String[] args) {
		 FruitJuice obj = new FruitJuice();
	        obj.input();
	        obj.discount();
	        obj.display();
	}

}
