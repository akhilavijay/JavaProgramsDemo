package singleinheritance;

public class Child extends Parent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child();
		c.getName("Akhila");
		c.getAge(26);
	}
	
	public void getAge(int Age) {
		System.out.println(Age);
	}

}
