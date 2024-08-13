package swe;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the word");
		String a=sc.nextLine();
		
		String rev="";
		
		for(int i=a.length()-1;i>=0;i--) {
			rev +=a.charAt(i);
		}
		System.out.println("The Reverse Is "+rev);
		if(a.equals(rev)) {
			System.out.println(a+"  Is Palindrome");
		}
		else {
			System.out.println(a+ "Is not a Palidrome");
		}
	}

}
