package exceptionhandling;

public class Throwexceptionhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 17;
		if(age>=18) {
			System.out.println("Qualified");
			
		}
		else {
			throw new ArithmeticException("not qulaified");
		}
	}

}
