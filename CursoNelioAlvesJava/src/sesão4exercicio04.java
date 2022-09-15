import java.util.Scanner;
public class sesão4exercicio04 {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	
	int num , hor; double gph , renda;
	
	System.out.println("Informe seu numero ");
	
	num = sc.nextInt();
	System.out.println("Informe suas horas trabalhadas ");
	
	hor = sc.nextInt();
	System.out.println("Informe o seu ganho por horas ");
	
	gph = sc.nextDouble();
	
	renda = (hor * gph);
	System.out.println("Seu numero e " + num + " e sua renda e " + renda);
	
	
	sc.close();
}
}
