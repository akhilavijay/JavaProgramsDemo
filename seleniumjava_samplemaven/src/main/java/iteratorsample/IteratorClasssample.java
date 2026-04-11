package iteratorsample;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;



public class IteratorClasssample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//creating a list 
		
		List<Integer> l = new LinkedList<Integer>();
		l.add(123);
		l.add(124);
		l.add(125);
		System.out.println(l);
		
		//creating an iterator
		
		Iterator<Integer> i = l.iterator();
		//hasNext()  - printing values in list to print the elements like stack
		while(i.hasNext()) {
			//print the elements
			System.out.println(i.next());
			
		}
		// removing last element from the list
		i.remove();
		System.out.println(l);
	}

}
