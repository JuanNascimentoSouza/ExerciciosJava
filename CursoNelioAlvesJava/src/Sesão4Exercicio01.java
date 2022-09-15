
import java.util.Scanner; 

public class Sesão4Exercicio01 {
	public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	
	int n1 , n2 , soma;
	n1 = sc.nextInt();
	System.out.println("A soma de " + n1);
	
	n2 = sc.nextInt();
	System.out.println("mais " + n2);
	
	soma = n1 + n2;
	
	System.out.println("A soma de " + n1 + " mais " + n2 + " e igual a " + soma);
	
	sc.close();
	
}
}
