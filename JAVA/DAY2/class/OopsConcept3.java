package swe;

//this keyword inn java


public class OopsConcept3 {
	String name;
	OopsConcept3(String name){
			this(10,20);
			this.name=name;
		    greeting();	
		    this.greeting();
	}
	OopsConcept3(int a,int b){
		System.out.println("Addition :"+(a+b));
	}
	
	void greeting() {
		System.out.println("welcome "+	name);
	}
	
	public static void main(String[] args) {
		OopsConcept3 obj=new OopsConcept3("abinesh");
	}

}
