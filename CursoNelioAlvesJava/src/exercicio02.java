
public class exercicio02 {
	public static void main(String[]args) {
		
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double mesure = 53.234567;
		
		System.out.printf("%.2f , with price is $ %.2f",product1 , price1, " \n %s whith the price %n", product2, price2);
		System.out.printf("%d years old, code %f and gender %s", age , code , gender);
		System.out.printf("Mesure with eight decimal places %d%.2f", mesure , "\n Rouded (Three decimal places): %f", mesure , "\n US decimal point: %s" , mesure);
		
	}
}
