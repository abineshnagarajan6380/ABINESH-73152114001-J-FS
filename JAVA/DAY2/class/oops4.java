package swe;

public class oops4 {
	void method1(String name) {
			System.out.println("Welcome"+name);
	}
	
	void method1(int a,int b) {
		System.out.println("Sum"+" "+(a+b));
	}
	
	void method1(int n) {
		System.out.println("Sum "+(n+n));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		oops4 obj=new oops4();
		obj.method1(5);
		obj.method1("abinesh");
		obj.method1(10,20);
		
		

	}

}
