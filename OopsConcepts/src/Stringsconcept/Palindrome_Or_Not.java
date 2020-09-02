package Stringsconcept;

import java.util.Scanner;

public class Palindrome_Or_Not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String rev="";
		int length =  str.length();
		for(int i=length-1;i>=0;i--)
		    rev = rev+str.charAt(i);
		if(str.equals(rev))
		{
			System.out.println("The given String is Palindrome");
		}else
		{
			System.out.println("The given string is not a palindrome");
		}
		sc.close();

	}

}
