package sampleProject;
// string class methods
public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello";
		System.out.println(s.length()); // print length of string
		System.out.println(s.toUpperCase()); // print into uppercase
		System.out.println(s.toLowerCase()); // print into lowercase
		
		String r1 = "World";
		String r2 = "Beautiful";
		System.out.println(r1.equals(r2));
		System.out.println(s.concat( " "+r1));
	}

}
