package Arrays;

import java.util.Scanner;

public class BignumInArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[]=new int[n];
		int i;
		for(i=0;i<n;i++)
		{
			a[i] = s.nextInt();
		}
		if(n<9)
		{
			System.out.println("Please enter 9 integer numbers ");
		}else {
			System.out.println("The given array is ");
			for(i=0;i<n;i+=3)
			{
				for(int j=i;j<i+3;j++)
				{
					System.out.print(a[j]+" ");
				}
				System.out.println();
			}
			System.out.println("Biggest number of given array is ");
			int m = a[0];
		    for(i=0;i<n;i++)
		    {
		    	m = Math.max(a[i], m);
		    }
		    System.out.println(m);
		    s.close();
		
		}
	}
}