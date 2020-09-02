package Arrays;

import java.util.Scanner;

public class Sum_Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,sum=0;
		float average;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter no. of elements:");
		n = s.nextInt();
		int[] a = new int[n];
		for(int i=0;i<a.length;i++)
		{
			a[i] = s.nextInt();
			sum+=a[i];
		}
		System.out.println("Sum: "+sum);
		average = (float)sum/n;
		System.out.println("Average:"+average);
		
		
s.close();
	}

}
