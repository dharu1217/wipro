package Day_3;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibonacci obj =new Fibonacci();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		  System.out.print("fibonacci series are >>>> "); 
		obj.Fibonacci(n);

	}
	public void Fibonacci (int a) {
		int n1=0,n2=1,n3;
		 for(int i=2;i<a;++i)    
		 {    
		  n3=n1+n2;    
		  System.out.print(" "+n3);    
		  n1=n2;    
		  n2=n3;    
		 }    
	}
}
