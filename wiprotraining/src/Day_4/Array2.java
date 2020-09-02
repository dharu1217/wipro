package Day_4;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array2 obj = new Array2();
		int a[] = new int[5];
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			a[i] = scan.nextInt();
		}
		obj.show(a);

}
	public void show(int[] arr)
	{
		System.out.println("the values in array are ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
	}

}
