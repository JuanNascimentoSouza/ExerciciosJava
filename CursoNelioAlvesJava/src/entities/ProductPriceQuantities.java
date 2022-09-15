package entities;
public class ProductPriceQuantities {
	
		public String name;
		public double price;
		public int quantity;
		
		public double totalValueInStorck() {
			return price * quantity;
		}
		public void addProducts(int quantity) {
			this.quantity += quantity;
		}
		public void removeProducts(int quantity) {
			this.quantity -= quantity;
		}
	}
	

