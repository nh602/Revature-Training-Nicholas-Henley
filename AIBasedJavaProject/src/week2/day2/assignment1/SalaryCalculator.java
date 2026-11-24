package week2.day2.assignment1;

import java.util.Scanner;

public class SalaryCalculator {

	// Business rules kept in one place so they are easy to find and change.
	private static final double HRA_PERCENT = 20;
	private static final double DA_PERCENT = 10;
	private static final double TAX_THRESHOLD = 20000;
	private static final double PROFESSIONAL_TAX = 200;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter employee ID: ");
		String employeeId = input.nextLine();

		System.out.print("Enter employee name: ");
		String employeeName = input.nextLine();

		System.out.print("Enter basic salary: ");
		double basicSalary = input.nextDouble();

		double hra = calculateHra(basicSalary);
		double da = calculateDa(basicSalary);
		double grossSalary = calculateGross(basicSalary, hra, da);
		double professionalTax = calculateProfessionalTax(grossSalary);
		double netSalary = grossSalary - professionalTax;

		printSalarySlip(employeeId, employeeName, basicSalary, hra, da,
				grossSalary, professionalTax, netSalary);

		input.close();
	}

	// HRA is 20% of the basic salary.
	public static double calculateHra(double basicSalary) {
		return basicSalary * HRA_PERCENT / 100;
	}

	// DA is 10% of the basic salary.
	public static double calculateDa(double basicSalary) {
		return basicSalary * DA_PERCENT / 100;
	}

	// Gross salary is basic + HRA + DA.
	public static double calculateGross(double basicSalary, double hra, double da) {
		return basicSalary + hra + da;
	}

	// Tax applies only when gross is above the threshold (exactly 20,000 pays no tax).
	public static double calculateProfessionalTax(double grossSalary) {
		if (grossSalary > TAX_THRESHOLD) {
			return PROFESSIONAL_TAX;
		}
		return 0;
	}

	public static void printSalarySlip(String employeeId, String employeeName,
			double basicSalary, double hra, double da, double grossSalary,
			double professionalTax, double netSalary) {
		System.out.println("\n--- Salary Slip ---");
		System.out.printf("Employee ID: %s%n", employeeId);
		System.out.printf("Employee Name: %s%n", employeeName);
		System.out.printf("Basic Salary: Rs. %.2f%n", basicSalary);
		System.out.printf("HRA: Rs. %.2f%n", hra);
		System.out.printf("DA: Rs. %.2f%n", da);
		System.out.printf("Gross Salary: Rs. %.2f%n", grossSalary);
		System.out.printf("Professional Tax: Rs. %.2f%n", professionalTax);
		System.out.printf("Net Salary: Rs. %.2f%n", netSalary);
	}
}
