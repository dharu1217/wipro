package Day_3;

import java.util.Scanner;

public class NumbertoWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumbertoWords obj=new NumbertoWords();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(obj.NumberstoWord(n));
		}
	public String NumberstoWord(int a) {
		String str="";
		int s=0;
		while(a>0) {
			int d=a%10;
			s=(s*10)+d;
			a/=10;
		}
	
		while(s>0) {
			int d=s%10;
			switch(d){
			case 1:
				str=str.concat("One ");
				break;
			case 2:
				str=str.concat("Two ");
				break;
			case 3:
				str=str.concat("Three ");
				break;
			case 4:
				str=str.concat("Four ");
				break;
			case 5:
				str=str.concat("Five ");
				break;
			case 6:
				str=str.concat("Six ");
				break;
			case 7:
				str=str.concat("Seven ");
				break;
			case 8:
				str=str.concat("Eight ");
				break;
			case 9:
				str=str.concat("Nine ");
				break;
			default:
				str=str.concat("Zero ");
				
				
			}
			s/=10;
			
		}
		return str;
	}

}
