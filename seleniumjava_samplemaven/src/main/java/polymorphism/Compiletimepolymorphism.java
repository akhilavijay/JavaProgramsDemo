// program uses method overloading. Program will be same as method overloading program
package polymorphism;

public class Compiletimepolymorphism {
	
	//creating method
	
	public void sample1(int Age) {
		System.out.println(Age);
	}
	
	public void sample1(String name) {
		System.out.println(name);
	}
	
	public void sample1(int a, int b) {
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//create object for the class
		
		Compiletimepolymorphism s1 = new Compiletimepolymorphism();
		s1.sample1(26);
		s1.sample1("Akhila");
		s1.sample1(2,3);
	}

}
