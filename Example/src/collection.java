import java.util.Collection;
import java.util.Iterator;
import java.util.ArrayList;
public class collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
		ArrayList<String> ar = new ArrayList<String>();	
		ar.add("Abhishek");
		ar.add("radhika");
	//	ar.add("Sharmistha");
		ar.add(3,"Rahul");
		ar.add(4,"Deepika");
		Iterator<String> itr = ar.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());			
		 }
		}
		
		catch(Exception e) {
		 System.out.println(e);
		}
		
		finally {
			
			System.out.println("I am in final block");
		}
	}
	
}
