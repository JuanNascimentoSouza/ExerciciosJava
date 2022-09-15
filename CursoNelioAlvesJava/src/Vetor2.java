import java.util.Scanner;

import entities.Vetor2Product;

public class Vetor2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Vetor2Product[] vect = new Vetor2Product[n];
		
		for (int i=0; i<vect.length; i++) {
			sc.nextLine();
		String name = sc.nextLine();
		double price = sc.nextDouble();
		vect[i] = new Vetor2Product(name, price);
		}
		double sum = 0.0;
		for (int i=0; i<n; i++) {
			sum+= vect[i].getPrice();
		}
		double avg = sum / n;
		
		System.out.printf("AVARAGE PRICE = %.2f%n", avg);
		sc.close();
		
		
	}
}
