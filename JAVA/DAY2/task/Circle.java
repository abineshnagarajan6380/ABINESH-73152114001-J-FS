package day2.task2;

public class Circle {
	int radius;
	void modify(int r) {
		this.radius=r;
	}
	

	public static void main(String[] args) {
	Circle c1=new Circle();
	c1.radius=8;
	System.out.println("area of the circle : "+3.14*(c1.radius*c1.radius));
	System.out.println("circumference of the circle :"+(2*3.14*c1.radius));
	c1.modify(10);
	System.out.println("area of the circle :  "+3.14*(c1.radius*c1.radius));
	System.out.println("circumference of the circle : "+(2*3.14*c1.radius));

	}

}
