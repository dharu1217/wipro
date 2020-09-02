package Day_3;

import java.util.Scanner;

public class PrimeorNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeorNot obj=new PrimeorNot();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(obj.primeornot(n)) {
			System.out.println("Prime Number ");
		}else {
			System.out.println("Not a Prime Number");
		}
		
	}
	public boolean primeornot(int a)
	{
		for(int i=2;i<a;i++) {
			if(a%i==0) {
				return false;
			}
		}
		return true;
	}

}
