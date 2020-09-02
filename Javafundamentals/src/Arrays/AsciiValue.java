package Arrays;

import java.util.Scanner;

public class AsciiValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a[]= new int[5];
		for(int i=0;i<5;i++)
		{
			a[i]= s.nextInt();
			System.out.println((char)a[i]+" ");
		}
		s.close();

	}

}
