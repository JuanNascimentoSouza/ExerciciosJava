package Package;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import Entities2.Contract;
import Entities2.Installment;
import model.services.ContractService;
import model.services.PaypalService;

public class OnlinePayService {

	public static void main(String[]args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Entre os dados do contrato: ");
		System.out.println("Número: ");
		int number = sc.nextInt();
		System.out.println("Data (dd/MM/yyyy): ");
		LocalDate date = LocalDate.parse(sc.next(), fmt);
		System.out.println("Valor do contrato: ");
		double totalValue = sc.nextDouble();
		
		Contract obj = new Contract(number,date,totalValue);
		
		System.out.print("Entre com o numero de parcelas: ");
		int n = sc.nextInt();
		
		ContractService contractService = new ContractService(new PaypalService());
		
		contractService.processContract(obj, n);
		
		System.out.println("Parcelas: ");
		for (Installment installment : obj.getInstalments()) {
			System.out.println(installment);
		}
		
		sc.close();
	}
}
