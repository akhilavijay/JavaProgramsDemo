package aggregation;

public class Class2aggregation  {
//creating instance variables
	
	int a;
	float b;
	
	Class1aggregation c1; // class1 entity reference
	
	//creating a constructor
	
	public Class2aggregation(int a, float b,Class1aggregation c1 ) {
		this.a = a;
		this.b=b;
		this.c1=c1;
	}
	
	//create a method to call the values
	
	public void getvalues() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c1.name);//parameter from class1
		System.out.println(c1.Age);// parameter from class1
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//creating object to exceute the methods
		//1. creating object for classs1
		Class1aggregation cl1= new Class1aggregation("Akhila", 26); // obj ref for classs1
		Class2aggregation cl2 = new Class2aggregation(6,4f,cl1); // cl1 -->contains the vlaues of class1
		cl2.getvalues();//calling the method to get values from constructor method in class2
	}

}
