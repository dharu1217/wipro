package Arrays;

import java.util.Scanner;

public class Remove10leftshift {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		int b[] = new int[n];
		int c=0,d=0;
		for(int i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
			if(a[i]!=10 && c==0)
			{
				b[d++]=a[i];
			}
			else
			{
				c++;
			}
		}
		for(int i=0;i<n-1;i++)
		{
			if(a[i]==10 && a[i+1]!=10) {
				b[d++] = a[i+1];
			}
		}
		for(int i=d;i<n;i++)
		{
			b[i]=0;
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(b[i]+" ");
		}
		sc.close();
	}

}
