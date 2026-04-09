package abstraction;

public class abstactchild extends abstactparent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// creating object for the class to execute
		
		abstactchild ab = new abstactchild();
		ab.admethod2(); // calling instance method
		ab.admethod3();
	}
	
	// to overridde in abstraction - click on the error in class name and add the unimplemented methif

	@Override
	public void admethod2() {
		// TODO Auto-generated method stub
		System.out.println("Hi hello how are you");
	}
	
	public void admethod3() {
		System.out.println("What is this!!!!!!!!!!!!!!!!!");
		
		//save
	}

}
