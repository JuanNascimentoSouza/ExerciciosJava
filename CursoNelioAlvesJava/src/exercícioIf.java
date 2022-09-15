import java.util.Scanner;
public class exercícioIf {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	
	int minutos = sc.nextInt();
	
	double conta = 50.0;
			if (minutos > 100)
				conta += (minutos - 100) * 2.0;
	
	System.out.printf("O valora da conta e = %.2f", conta);
	
	sc.close();
	
}
}
