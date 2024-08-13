package swe;
//constructor overloading 
public class oops6{
	//constructor
	 oops6(String name) {
		 this(10,20);
			System.out.println("Welcome"+name);
	}
	
	 //constructor
	 oops6(int a,int b) {
		 this(5);
		System.out.println("Sum"+" "+(a+b));
	}
	
	 
	//constructor
	 oops6(int n) {
		System.out.println("Sum "+(n+n));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		oops6 obj1=new oops6("abinesh");
		
	}

}
