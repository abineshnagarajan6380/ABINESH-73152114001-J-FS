package swe;
import java.util.Scanner;
public class PrimeNumber {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
	int num=sc.nextInt();
	boolean isPrime=true;
	for(int i=2;i<num;i++) {
		if(num%i==0) {
			isPrime=false;
			break;
		}
	}
	if(isPrime) {
		System.out.println(num +" is Prime Number");
	}
	else {
		System.out.println(num +"is not Prime");
	}
	}
}
