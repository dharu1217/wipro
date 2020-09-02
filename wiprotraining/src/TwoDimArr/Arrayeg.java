package TwoDimArr;

import java.util.Scanner;

public class Arrayeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[][] = new int[3][];
		x[0] = new int[3];
		x[1] = new int[5];
		x[2] = new int[2];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<x.length;i++)
		{
			for(int j = 0;j<x[i].length;j++)
			{
				x[i] = sc.nextInt();
			}
		}
		

	}

}
/*Create a 2D array with
1st row = 3 column 
2nd row = 5 column 
3rd row = 2 column
Get the input for the 2D array*/