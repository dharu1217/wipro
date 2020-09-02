package Arrays;

import java.util.Scanner;

public class LarAndSmall2Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int l1,l2,temp;
		l1=a[0];
		l2=a[1];
		if(l1<l2)
		{
			temp=l1;
			l1=l2;
			l2=temp;
		}
		for(int i=2;i<a.length;i++)
		{
			if(a[i]>l1)
			{
				l2=l1;
				l1=a[i];
			}
			else if(a[i]>l2 && a[i]!=l1 )
			{
				l2=a[i];
			}
		}
		System.out.println(l1+" "+l2);
		if(l1>l2)
		{
			temp=l1;
			l1=l2;
			l2=temp;
		}
		for(int i=2;i<a.length;i++)
		{
			if(a[i]>l1)
			{
				l2=l1;
				l1=a[i];
			}
			else if(a[i]<l2 && a[i]!=l1)
			{
				l2=a[i];
			}
		}
		System.out.println(l1+" "+l2);
	sc.close();	
	}

}
