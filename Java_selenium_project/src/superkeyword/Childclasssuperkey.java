
package superkeyword;

public class Childclasssuperkey extends Parentclasssuperkey {
	
	int variable = 250;
	
	// create a instance method to print the value of var
	
	public void instmethod() {
		System.out.println(variable); // this will print the var value in child calss
		System.out.println(super.variable); // this will print the var value from the parent class
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// creating an object to call the method and print the values
		
		Childclasssuperkey csk = new Childclasssuperkey();
		csk.instmethod();
	}

}
