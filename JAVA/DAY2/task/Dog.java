package day2.task2;

public class Dog {
	String name;
	String breed;
	Dog(String n,String b){
		this.name=n;
		this.breed=b;
		display();
	
	}
	void setname(String n,String b){
		this.name=n;
		this.breed=b;
		display();
	}
	void display() {
		System.out.println("Dog Name:"+name);
		System.out.println("Breed :"+breed);
	}

	public static void main(String[] args) {
		Dog d1=new Dog ("tom","germen");
		d1.setname ("mani","boxer");
		

	}

}
