
public class StaticMethod {
	
	int a =10;
	static int b=20;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	  StaticMethod.Disp();
	  
	  StaticMethod M = new StaticMethod();
	  M.Show();
	  M.Disp();
	  
		
	}
	
	static void Disp(){
		
		System.out.println("Disp Static method " +b );
	}

	void Show(){
		
		System.out.println("Show method "+a +b );
		
	}
}
