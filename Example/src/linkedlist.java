import java.util.LinkedList;
import java.util.ListIterator;

public class linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		list.add(2);
		list.add(2);
		list.add(2);
		list.add(3,4);
		
		ListIterator<Integer> itr =  list.listIterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
			

}}
