package Arrays;

import java.util.Scanner;

public class Evenfirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[] = new int[n];
		for(int i = 0;i<n;i++)
		{
			a[i] = s.nextInt();
			if(a[i]%2==0) {
				System.out.print(a[i]+" ");
			}
		}
		for(int i=0;i<n;i++)
		{
			if(a[i]%2!=0) {
				System.out.print(a[i]+" ");
			}
		}
		s.close();

	}

}
