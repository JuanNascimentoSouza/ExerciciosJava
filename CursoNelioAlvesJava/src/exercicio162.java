package Package;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities2.employee;
import Entities2.outsourcedEmployee;

public class exercicio162 {

	public static void main(String[]args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<employee> list = new ArrayList<>();
		
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.print("Employee #" + i + "1 data:");
			System.out.println("Outsourced (y/n)?");
			char ch = sc.next().charAt(0);
			System.out.print("Name");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			if(ch == 'y') {
				System.out.print("Additional charge; ");
				double additionalCharge = sc.nextDouble();
				list.add(new outsourcedEmployee(name, hours, valuePerHour,additionalCharge));
			}
			else {
				list.add(new employee(name, hours, valuePerHour));
			}
		}
		
		System.out.println();
		System.out.println("PAYMENTS: ");
		for (employee emp : list) {
			System.out.println(emp.getName() + " = $" + emp.payment());
			
		}
		
		sc.close();
	}
}
