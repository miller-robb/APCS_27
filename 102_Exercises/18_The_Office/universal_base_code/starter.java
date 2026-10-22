/*
 *	Author: Miller Robb
 *  Date: 10/21/26
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
		michael.employeeToString();

		Employee dwight=new Employee(1987,"Dwight","Shrute",4416.66);
		dwight.raiseSalary(20);
		dwight.employeeToString();
		System.out.println("Annual Salary: "+dwight.getAnnualSalary());

		Employee jim=new Employee(2474,"Jim","Halpert",4416.66);
		jim.raiseSalary(10);
		jim.employeeToString();
		System.out.println("Annual Salary: "+jim.getAnnualSalary());

		Employee pam=new Employee(2011,"Pam","Beesly",2250.0);
		pam.raiseSalary(5);
		pam.employeeToString();
		System.out.println("Annual Salary: "+pam.getAnnualSalary());

		Employee jan=new Employee(1000,"Jan","Levinson-(no)gould",9000.00);
		jan.raiseSalary(25);
		jan.employeeToString();
		System.out.println("Annual Salary: "+jan.getAnnualSalary());
		
		
	}
}
