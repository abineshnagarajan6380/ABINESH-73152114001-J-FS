package swe;

//types of variables in java

public class OopsConcept1 {       int b=20;//Instance or Object Variable 
       static int c=30;//static or class variable 
       
 public static void main(String []args) {
	 int a=10;//local Variable 
	 System.out.println("Local variable :"+a);
	 
	 OopsConcept1 obj=new OopsConcept1 ();
	 System.out.println(obj.b);
	 
	 System.out.println(OopsConcept1.c);
 }
}
