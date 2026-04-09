package hierarchicalinheritance;

import accessspecifier.Protectedaccess;

// trying to access protected method created in Protectedaccess class from accessspcifier package
public class Protectedsamp3 extends Protectedaccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//creating object
		
		Protectedsamp3 vv = new Protectedsamp3();
		vv.sample("Akhila");
	}

}
