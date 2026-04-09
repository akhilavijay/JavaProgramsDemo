package interfacepackage;

public class Sampleint3 implements Sampleinterface{ // inheritance with interface and class 
	
	public static void main(String agrs[]) {
		//creating an object for the class
		
		Sampleint3 sp = new Sampleint3();
		sp.method();
		sp.method2();
	}

	@Override
	public void method() {
		// TODO Auto-generated method stub
		System.out.println("Hi Hello");
		
	}
	
	public void method2() {
		System.out.println("How are you");
	}
	

}
