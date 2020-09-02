package Arrays;

import java.util.Scanner;

public class Rev2dimarr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int a[] = new int[n];
		int i;
		for(i=0;i<n;i++) {
			a[i] = scan.nextInt();
		}
		if(n<4) {
			System.out.println("Please enter 4 integers");
		}else {
			System.out.println("The given array is ");
			for(i =0;i<n;i++) {
				for(int j=i;j<i+2;j++) {
					System.out.print(a[j]+" ");
				} 
				System.out.println();
			}
			System.out.println("The reverse of the array is ");
			for(i=n-1;i>=0;i-=2) {
				for(int j=i;j>i-2;j--) {
					System.out.print(a[j]+" ");
				}
				System.out.println();
			}
		}
		scan.close();

	}

}
