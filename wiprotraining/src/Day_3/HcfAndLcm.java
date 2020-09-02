package Day_3;

import java.util.Scanner;

public class HcfAndLcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int temp1=hcf(a,b);
		int temp2=lcm(a,b);
		System.out.println("LCM is "+lcm(c,temp1)+" HCF is "+hcf(c,temp2));

	}
	public static int hcf(int x,int y) {
		int temp;
		while(y>0) {
			temp=y;
			y=x%y;
			x=temp;
			
		}
		return x;
	}
	public static int lcm(int x,int y) {
		return (x*y)/hcf(x,y) ;
		
	}
}
