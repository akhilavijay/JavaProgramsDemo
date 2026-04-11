package listmethod;


import java.util.LinkedList;
import java.util.List;

public class Listmethodsample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// creating a list
		List<Integer> l = new LinkedList<Integer>();
		l.add(12);
		l.add(13);
		l.add(14);
		//to see elements in list
		System.out.println(l);
		
		//to get element from list
		System.out.println(l.get(1));
		
		//setting element in an index
		l.set(2,30);
		System.out.println(l);
		
	//size
		
		System.out.println(l.size());
		
		//checking list empty or not
		
		System.out.println(l.isEmpty());
		
		//remove
		l.remove(1);
		System.out.println(l);
		
		//checking element exist or not
		
		System.out.println(l.contains(99));
		
		//indexof
		
		System.out.println(l.indexOf(30));
		l.add(30);
		System.out.println(l.indexOf(30));
		
		System.out.println(l.lastIndexOf(30));
	}

}
