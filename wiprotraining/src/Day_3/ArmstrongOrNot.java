package Day_3;

import java.util.Scanner;

public class ArmstrongOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArmstrongOrNot obj = new ArmstrongOrNot();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(obj.ArmstrongOrNot(n))
		{
			System.out.println("Armstrong Number");
		}else
		{
			System.out.println("Not an Armstrong number");
		}
sc.close();
	}
	public boolean ArmstrongOrNot (int a)
	{
		int temp = a;
		int s = 0;
		while(a>0)
		{
			int d = a%10;
			s+=(int)Math.pow(d,3);
			a/=10;
		}if(s==temp)
		{
			return true;
		}
		return false;
	}
}
