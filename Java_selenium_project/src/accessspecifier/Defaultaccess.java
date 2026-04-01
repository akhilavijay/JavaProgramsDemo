package accessspecifier;

public class Defaultaccess {
	
	//creating a method with defautl access specifier
	
	void smethod(int Age) {
		System.out.println(Age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//creating an object for this class
		Defaultaccess dd = new Defaultaccess();
		dd.smethod(26);
	}

}
