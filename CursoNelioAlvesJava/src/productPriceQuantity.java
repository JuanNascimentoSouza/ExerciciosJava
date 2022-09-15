import java.util.Scanner;
import entities.ProductPriceQuantities;
public class productPriceQuantity {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ProductPriceQuantities product = new ProductPriceQuantities();
		
		System.out.println("Enter product data: ");
		System.out.println("Name: ");
		product.name = sc.nextLine();
		System.out.println("Price: ");
		product.price = sc.nextDouble();
		System.out.println("Quantity in stock: ");
		product.quantity = sc.nextInt();
		
		System.out.println(product.name + " " + product.price + " " + product.quantity);
		
		sc.close();
	}
}
