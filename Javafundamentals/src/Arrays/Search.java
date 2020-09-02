package Arrays;

import java.util.Scanner;

public class Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int i,found=0;
		int n = s.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		int check = s.nextInt();
		for(i=0;i<n;i++)
		{
			if(a[i]==check)
			{
				found = 1;
				break;
			}
			else {
				found=0;
			}
		}if(found==1)
		{
			System.out.println(i);
		}
		else {
			System.out.println("-1");
		}
		s.close();
		}
}
