package hierarchicalinheritance;

public class Son extends Father{

	public static void main(String[] args) {
		// create object and call method from father class and method from son
		
		Son s = new Son();
		s.getName("Akhila");
		s.getAge(26);
		
	}
	
	public void getAge(int age) {
		System.out.println(age);
	}

}
