import java.util.HashSet;
import java.util.Iterator;

public class set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> abc	= new HashSet<String>();
		
		abc.add("test");
		abc.add("tess");
		
		abc.add(" ");
		abc.add("");
		
		Iterator<String> itr = abc.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		}
		
}
