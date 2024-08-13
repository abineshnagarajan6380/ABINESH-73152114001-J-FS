package swe;
//types of methods inn java
public class OopsConcept2 {

	void mymethod1() {
			System.out.println("Instance Method");	
	}
	
	static void mymethod2() {
		System.out.println("Static method ");
	}
	
	public static void main(String [] args ) {
		OopsConcept2 obj=new OopsConcept2();
		obj.mymethod1();
		
		OopsConcept2.mymethod2();
	}
}
