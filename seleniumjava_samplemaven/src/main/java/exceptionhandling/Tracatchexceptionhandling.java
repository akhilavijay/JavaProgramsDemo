package exceptionhandling;

public class Tracatchexceptionhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		// adding exception handling try catch finally
		try {
		int b = a/0;
		System.out.println(b);
		}
		
		catch(ArithmeticException e) {
			System.out.println(e);
			
		}
		finally {
			System.out.println("Hello");
		}
		
		
	}

}
