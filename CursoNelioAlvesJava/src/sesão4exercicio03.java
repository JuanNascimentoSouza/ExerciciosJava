import java.util.Scanner;

public class sesão4exercicio03 {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	
	int a , b , c , d , soma;
	
	a = sc.nextInt();
	System.out.println(" vezes ");
	
	b = sc.nextInt();
	System.out.println(" menos ");
	
	c = sc.nextInt();
	System.out.println("vezes");
	
	d = sc.nextInt();
	soma = a * b - c * d;
	System.out.println(" a diferenca e " + soma);
	
	
	sc.close();
}
}
