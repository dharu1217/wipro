package ClassAndObjects;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double powerInt = Calci.powerInt(2,3);
		double powerDouble = Calci.powerDouble(3,5);
		System.out.println(powerInt);
		System.out.println(powerDouble);

	}
	static class Calci{
		static double powerInt(int a,int b) {
			return Math.pow(a, b);
		}
		static double powerDouble(double a,double b) {
			return Math.pow(a, b);
		}
		
	}

}
