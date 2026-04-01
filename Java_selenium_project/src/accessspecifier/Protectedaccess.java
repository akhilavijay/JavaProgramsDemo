package accessspecifier;

public class Protectedaccess {
//creating a method using protected
	
	protected void sample(String Name) {
		System.out.println(Name);
	}
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			//creating an object
			
			Protectedaccess pa = new Protectedaccess();
			pa.sample("Akhila");

	}

}
