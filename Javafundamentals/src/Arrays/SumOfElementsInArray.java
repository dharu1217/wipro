package Arrays;

import java.util.Scanner;

public class SumOfElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-genesrated method stub
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int a[] = new int[n];
		int n1=-1,n2=-1;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			if(a[i]==6)
			{
				n1=i;
			}
			if(a[i]==7)
			{
				n2=i;
			}
		}
		int sum=0;
		if(n1<n2)
		{
			if(n1!=-1 && n2!=-1)
			{
				for(int i=0;i<n1;i++)
				{
					sum+=a[i];
				}
				for(int i=n2+1;i<n;i++)
				{
					sum+=a[i];
				}
			}
			else
			{
				for(int i=0;i<n;i++)
				{
					sum+=a[i];
				}
			}
		}
		else
		{
			for(int i=0;i<n;i++)
			{
				sum+=a[i];
			}
		}
		System.out.println(sum);
		sc.close();
	}


}
