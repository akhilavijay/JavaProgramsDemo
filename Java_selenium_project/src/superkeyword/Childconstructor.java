package superkeyword;

public class Childconstructor extends Parentconstruct{
	//creating a constructor method
	public Childconstructor(int a, int b) {
		super("Parent class constructor"); // this will invoke parent class constructor method
		int sum = a+b;
		System.out.println(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// creating object to invoke the method 
		Childconstructor cc = new Childconstructor(5,6);
	
	}

}
