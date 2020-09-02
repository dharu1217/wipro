package Arrays;

import java.util.Scanner;

public class SortArray6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i] = s.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					int temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Array elements in sorted order:");
		for(int i=0;i<n-1;i++)
		{
			System.out.print(a[i]+ ",");
		}
		System.out.print(a[n-1]);

		s.close();
	}

}
