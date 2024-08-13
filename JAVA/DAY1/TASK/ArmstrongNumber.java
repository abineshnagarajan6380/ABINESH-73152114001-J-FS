package swe;
import java.util.Scanner;
public class ArmstrongNumber {
	public static void main (String [] args) {
		Scanner inp=new Scanner (System.in);
		int num=inp.nextInt();
		int temp=num;
		int temp1=num;
		int count=0;
		int total=0;
		while(num>0) {
			num=num/10;
			count++;
		}
		while(temp>0) {
			int last=temp%10;
			int prod=1;
			int power=count;
			while(power>0) {
				prod=prod*last;
				power--;
			}
			total=total+prod;
			temp/=10;
		}
		if(temp1==total) {
			System.out.println("Arm Strong Number");
		}
		else {
			System.out.println("Not a Arm Strong Number");
		}
		
	}

}
