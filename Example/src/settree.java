import java.util.Iterator;
import java.util.TreeSet;

public class settree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Integer> set = new TreeSet<Integer>();
		
		set.add(10);
		set.add(32);
		set.add(54);
		set.add(1);
		set.add(3);
		
		Iterator<Integer> itr = set.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}	

	}

}
