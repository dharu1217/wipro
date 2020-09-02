package Looping;

import java.util.Scanner;

public class Casetoggle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		char ch = sc.next().charAt(0);
		if(Character.isLowerCase(ch))
			{
			System.out.print(ch+"->"+Character.toUpperCase(ch));
			}else {
				System.out.print(ch+"->"+Character.toLowerCase(ch));
			}
		sc.close();
	
		
	}

}
