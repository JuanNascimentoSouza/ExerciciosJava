import java.util.Scanner;
import java.util.Locale; //locale pode dar erro com a vírgula"

public class EntradaDeDadosScanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Locale.setDefault(Locale.US);

		String x;
		x = sc.next();
		System.out.println("Voce digitou: " + x);

		int y;
		y = sc.nextInt();
		System.out.println("voce digitou: " + y);

		double z;
		z = sc.nextDouble();
		System.out.println("voce digitou: " + z);

		char w;
		w = sc.next().charAt(0);
		System.out.println("vocfe digitou: " + w);

		sc.close();
	}
}
