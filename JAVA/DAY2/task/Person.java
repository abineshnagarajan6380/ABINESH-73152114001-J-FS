package day2.task2;

public class Person {
	String name;
	int age;
	Person (String n, int age){
		this.name =n;
		this.age =age;
		this.display();
	}
	void display(){
		System.out.println(name);
		System.out.println(age);
	}
	public static void main(String[] args) {
		Person p1=new Person("vicky",20);

	}

}
