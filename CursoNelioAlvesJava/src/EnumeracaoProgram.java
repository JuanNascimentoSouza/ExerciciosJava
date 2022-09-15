import java.util.Date;

import entities.OrderEnums;
import entities.enums.Enumeracao;

public class EnumeracaoProgram {

	public static void main(String[]args) {
		OrderEnums order = new OrderEnums(1080,new Date(),Enumeracao.PENDING_PAYMENT);
		
		System.out.println(order);
		
		Enumeracao os1 = Enumeracao.DELIVERED;
		
		Enumeracao os2 = Enumeracao.valueOf("DELIVERED");
		
		System.out.println(os1);
		System.out.println(os2);
	}
}
