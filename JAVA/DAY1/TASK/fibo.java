package swe;
import java.util.Scanner;
public class fibo {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		int a=0;
		int b=1;
		int result=0;
		for(int i=0;i<num;i++) {
			result=a+b;
			a=b;
			b=result;
			System.out.print(result+" ");
		}
		System.out.println();
System.out.println(result);
	}

}
