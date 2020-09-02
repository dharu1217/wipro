package Day_3;

import java.util.Scanner;

public class PerfectOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PerfectOrNot obj=new PerfectOrNot();
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		if(obj.PerfectOrNot(n)) {
			System.out.println("Perfect  Number ");
		}else {
			System.out.println("Not a Perfect Number");
		}
}
public boolean PerfectOrNot(int a) {
		
		int s=0;
	for(int i=1;i<a;i++) {
		if(a%i==0) {
			s+=i;
		}
	}
	if(s==a) {
		return true;
	}
	return false;
   }
}

