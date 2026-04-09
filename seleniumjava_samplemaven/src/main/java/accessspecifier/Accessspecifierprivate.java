package accessspecifier;

public class Accessspecifierprivate {
//creating a private method
	private void samplepgm(int Age) {
		System.out.println(Age);
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//calling the private method here
		
		Accessspecifierprivate sp = new Accessspecifierprivate ();
		sp.samplepgm(20);
	}

}
