package exceptionhandling;

public class Throwsexception1 {

	public static void main(String[] args) throws NotqulaifiedException { // using throws declaring the custom excpetion
		// TODO Auto-generated method stub
		int age = 17;
		if(age>=18) {
			System.out.println("Qualified");
			
		}
		else {
			throw new NotqulaifiedException("not qulaified"); // creating a custom exception
		}
	}

}
