package teste;

import java.util.Locale;
import java.lang.System;

public class LinguagemDoSistema {

	public static void main(String[] args) {

		Locale currentLocale = Locale.getDefault();
		currentLocale.getDisplayLanguage();
		System.out.println(currentLocale);
	}

}
