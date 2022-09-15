import java.util.Scanner;

import entities.Triangle;

public class problemaSemOrientaçãoAObjetos {
	public static void main(String[] args) {

		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the measures of triangle x ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Enter the measures of triangle y");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		
		double areax = x.area();
		
		double areay = y.area();
		
		System.out.printf("Triangle X area %.4f%n ", areax);
		System.out.printf("Triangle Y area %.4f%n ", areay);
		
		if (areax > areay) {
			System.out.println("Larger area X");
		}else {
			System.out.println("Larger area Y");
		}
		
		
		
		sc.close();
	}
}
