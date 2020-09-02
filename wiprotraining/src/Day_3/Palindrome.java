package Day_3;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Palindrome obj=new Palindrome();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(obj.Palindrome(n)) {
			System.out.println("palindrome Number ");
		}else 
		{
			System.out.println("Not a palindrome Number");
		}
}
	public boolean Palindrome (int a) {
		int s=0;
		int temp=a;
		while(a>0) {
			int d=a%10;
			s=(s*10)+d;
			a/=10;
		}
		if(s==temp) {
			return true;
		}
		   return false;
		}
	}
