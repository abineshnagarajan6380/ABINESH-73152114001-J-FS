package day2.task2;

public class Rectangle {
	int width;
	int height;
	void calu(int w,int h){
		this.width=w;
		this.height=h;
		this.display();
	}
	void display() {
		System.out.println("area of the rectangle :"+(width+height));
		System.out.println("perimeter of the rectangle :"+(width+height)*2);
		
	}

	public static void main(String[] args) {
		Rectangle r1=new Rectangle();
        r1.calu(10,8);
	}

}
