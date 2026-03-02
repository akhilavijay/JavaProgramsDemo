package multilevelinheritance;

public class Son extends Father{

	public static void main(String[] args) {
		//creating object 
		//with the object reference calling the methods from the Grandfather and Father class
		
		Son s=new Son();
		s.getName("Akhila"); //method from grandfather
		s.getAge(26); // method from father - intermediate class
		s.getId(1001);
	}
	
	public void getId(int id) {
		System.out.println(id);
	}

}
