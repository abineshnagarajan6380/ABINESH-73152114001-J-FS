package swe;

public class oops5{
	 oops5(String name) {
			System.out.println("Welcome"+name);
	}
	
	 oops5(int a,int b) {
		System.out.println("Sum"+" "+(a+b));
	}
	
	 oops5(int n) {
		System.out.println("Sum "+(n+n));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		oops5 obj1=new oops5("abinesh");
		oops5 obj2=new oops5(10,20);
		oops5 obj3=new oops5(5);

	}

}
