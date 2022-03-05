package assisted_project_no4_program;

public class MethodExecution {
	
	//method demo
	public int multipynumbers(int a,int b) {
		int z=a*b;
		return z;
	}

	public static void main(String[] args) {

		MethodExecution b=new MethodExecution();
		int ans= b.multipynumbers(10,3);
		System.out.println("Multipilcation is :"+ans);
		}

}
