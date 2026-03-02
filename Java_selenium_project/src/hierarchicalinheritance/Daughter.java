package hierarchicalinheritance;

public class Daughter extends Father{

	public static void main(String[] args) {
		// create object and call method from father class and daughter class
		// son class will not come in daughter class. 
		
		Daughter d = new Daughter();
		d.getName("Vijay");
		d.getId(1001);

	}
	
	public void getId(int id) {
		System.out.println(id);
	}
}
