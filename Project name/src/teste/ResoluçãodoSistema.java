package teste;

import java.awt.Dimension;
import java.awt.Toolkit;

public class ResoluçãodoSistema {

	public static void main(String[] args) {
		Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
		int lar = (int) tela.getWidth();
		int aut = (int) tela.getHeight();
		
		System.out.println("A resolucao a "+ lar +' '+ aut);

	}

}
