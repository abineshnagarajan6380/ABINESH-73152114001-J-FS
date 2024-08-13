package swe;
import java.util.Scanner;
public class ArmStrongNumber1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num=sc.nextInt();
		int sum=0;
		int temp=num;
		String num1=Integer.toString(num);
		while(num!=0) {
			int last=num%10;
			sum+=Math.pow(last,num1.length());
			System.out.println(sum);
			num/=10;
		}
		if(sum==temp) {
			System.out.println("Arm Strong Number");
		}else {
			System.out.println("is not a ArmStrong Number");
		}
	}

}
