package Looping;

import java.util.Scanner;

public class charvar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		if(((ch>='a')&&(ch<='z'))||((ch>='A')&&(ch<='Z')))
		{
				System.out.println("Alphabhet");
		}else if((ch>='0')&&(ch<='9'))
		{
			System.out.println("Digit");
		}
		else
		{
			System.out.println("Special Character");
		}
		sc.close();

	}

}
