package Looping;

import java.util.Scanner;

public class Arguments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String str="";
		str = in.nextLine();
		if(str.length()<1)
		{
			System.out.println("No values");
		}else {
			String[] a1 = str.split(" ",str.length());
			
			for(int i=0;i<a1.length;i++)
			{
				System.out.println(a1[i]+",");
			}
		}
		in.close();
	}

}
