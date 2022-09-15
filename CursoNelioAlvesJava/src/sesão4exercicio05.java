import java.util.Scanner;
public class sesão4exercicio05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String cod1 , cod2;
		int quant1 , quant2;
		Double price1 , price2 , total;
		
		System.out.println("Digite o primeiro codigo");
		
		cod1 = sc.next();
		System.out.println("Digite a quantidade ");
		
		quant1 = sc.nextInt();
		System.out.println("Digite o preco ");
		
		price1 = sc.nextDouble();
		System.out.println("Digite o segundo código ");
		
		cod2 = sc.next();
		System.out.println("Digite a quantidade ");
		
		quant2 = sc.nextInt();
		System.out.println("Digite o preco ");
		
		price2 = sc.nextDouble();
		total = quant1 * price1 + quant2 * price2;
		System.out.printf("Total a pagar= %.2f \n", total);
		System.out.println("códigos " + cod1 + " " + cod2);
		
		
		sc.close();
		 
		
	}

}
