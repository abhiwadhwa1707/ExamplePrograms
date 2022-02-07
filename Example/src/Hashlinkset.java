import java.util.Iterator;
import java.util.LinkedHashSet;

public class Hashlinkset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashSet<String> set = new LinkedHashSet<String>();
		LinkedHashSet<String> set2 = new LinkedHashSet<String>();
		set.add("bbbc");
		set2.add("aaa");
		set.clone();
           Iterator<String> itr = set.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println();
		
		
	}

}
