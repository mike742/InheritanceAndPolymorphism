package payroll;

import java.util.Scanner;

//  include a getEarnings method that is abstract
abstract class Employee {
	private String _name;
	private String _ssn;
	private int _birthdayMonth;
	private int _birthdayWeek;

	protected static Scanner _scanner = new Scanner(System.in);
	
	public void load() { 
		System.out.print("Name ==> ");
		_name = _scanner.nextLine();
		System.out.print("Social security number ==> ");
		_ssn = _scanner.nextLine();
		System.out.print("Birthday month (1-12) ==> ");
		_birthdayMonth = Integer.parseInt(_scanner.nextLine());
		System.out.print("Birthday bonus week (1-4) ==> ");
		_birthdayWeek = Integer.parseInt(_scanner.nextLine());
	}

	public String toString() {
		return "employee: " + _name + "\nsocial security number: " + _ssn;
	}

	public double getBonus() {
		int currentMonth = 10; // Calendar
		int currentWeek = 2;
		double bonus = 0;
		
		if(_birthdayMonth == currentMonth && _birthdayWeek == currentWeek) {
			bonus = 100;
		}
		
		return bonus;
	}
	
	public abstract double getEarnings();
}

class Hourly extends Employee {

	private double _hourlyPay;
	private int _hours;

	public void load() {
		super.load();
		
		System.out.print("Hourly pay ==> ");
		_hourlyPay = Double.parseDouble(_scanner.nextLine());
		
		System.out.print("Hours worked this past week ==> ");
		_hours = Integer.parseInt(_scanner.nextLine());
	}

	public String toString() {
		return super.toString() + "\npaycheck: $" + getEarnings();
	}

	@Override
	public double getEarnings() {
		
		double salary = 0;
		
		// salary  calculation should be here!!!!
		
		salary += getBonus();
		
		return salary;
	}
}


public class PayrollDriver {

	public static void main(String[] args) {

		Hourly e1 = new Hourly();
		e1.load();
		
		System.out.println(e1); 
	}
}
