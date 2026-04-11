package exceptionhandling;

public class Multipleexceptionhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//handling arithmetic exception and arrayindexoutofbound exception
		
		try {
			
			//initializing array
			
			int array[] = new int[3];
			array[4] = 20/0; // array[4] -. arrayindexoutofbound error and zero divided by error
		}
		/*
		catch(ArithmeticException e) {
			System.out.println(e);
			
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		
		*/
		
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
