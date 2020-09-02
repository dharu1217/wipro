package Inheritance;

public class Employee extends Person {
	double Annual_salary;
	int Work_year;
	String Number;
	Employee(double Salary,int Work,String number){
		super("Dharani");
		this.Annual_salary=Salary;
		this.Work_year=Work;
		this.Number=number;
	}
	void display()
	{
		System.out.println("Annual Salary is "+Annual_salary +"\nStarted working from "+Work_year+"\nInsurance Number is "+Number);;
	}

}