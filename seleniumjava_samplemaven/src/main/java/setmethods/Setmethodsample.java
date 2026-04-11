package setmethods;

import java.util.HashSet;
import java.util.Set;

public class Setmethodsample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//creating two sets 
		
		Set<Integer> s = new HashSet<Integer>();
		Set<Integer> s1 = new HashSet<Integer>();
		s.add(11);
		s.add(12);
		s.add(13);
		s.add(14);
		System.out.println("set one is" + s);
		s1.add(21);
		s1.add(22);
		s1.add(23);
		s1.add(24);
		System.out.println("set two is" + s1);
		
		//adding set s to set s1
		
		s1.addAll(s);
		System.out.println(s1);
		
		System.out.println(s1.size());
		System.out.println(s.size());
		
		System.out.println(s.isEmpty());
		
		System.out.println(s.contains(22));
		
		System.out.println(s1.contains(24));
		
		s.remove(12);
		System.out.println(s);
		
		s1.removeAll(s);
		System.out.println(s1);
		
		s1.clear();
		System.out.println(s1);
		
	}

}
