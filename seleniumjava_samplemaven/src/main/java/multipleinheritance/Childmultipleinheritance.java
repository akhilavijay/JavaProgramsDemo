package multipleinheritance;

public class Childmultipleinheritance implements Multipleinheritance1, Multipleinheritance2 {

	public static void main(String args[]) {
		//creating object for the class
		Childmultipleinheritance cp = new Childmultipleinheritance();
		cp.mulint1();
		cp.mulint2();
		cp.childclassmethod();
	}
	@Override
	public void mulint2() {
		// TODO Auto-generated method stub
		System.out.println("Hi Akhila");
	}

	@Override
	public void mulint1() {
		// TODO Auto-generated method stub
		System.out.println("You are beacutiful");
	}

	public void childclassmethod() {
		System.out.println("good job");
	}
}
