package Arrays;

import java.util.Scanner;

public class Only10r4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[] = new int[n];
		int count = 0;
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
			if(a[i]==1 || a[i]==4) {
				count++;
			}
		}
		if(count==n)
		{
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		s.close();

	}

}
