package Looping;

import java.util.Scanner;

public class Alphabeticalorder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		char ch = s.next().charAt(0);
		char ch1 = s.next().charAt(0);
		if(ch1>ch)
		{
			System.out.println(ch+","+ch1);
		}else
		{
			System.out.println(ch1+","+ch);
		}
		s.close();
		

	}

}
