package Looping;

import java.util.Scanner;

public class Floyds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,num = 1;
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
				num++;
			}
			System.out.println();
		}
	}

}
