package polymorphism;

public class Runtimepolychild extends Runtimepolyparentclass {  // using extends inheriting Runtimepolyparentclass
// creating same method created in parent class
	public void runTimesample(String name) {
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
// creating child class object to call/run the method in child class
		Runtimepolychild rp = new Runtimepolychild();
		rp.runTimesample("Akhila");
		
		
		// creating obejct using upcasting
		
		Runtimepolyparentclass rp1 = new  Runtimepolychild();
		rp1.runTimesample("Sreekutty");
	}

}
