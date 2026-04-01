
// invoking immediate parent class methods

package superkeyword;

public class Childinvokemethod extends Parentinvokemethods{
	
	//creating a method with same name as created in parent class
	public void samplemethod() {
		super.samplemethod(); // this will invoke the method in parent class and print the value
		System.out.println("Child class method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//creating an object to invoke method
		
		Childinvokemethod cim = new Childinvokemethod();
		cim.samplemethod();
	}

}
