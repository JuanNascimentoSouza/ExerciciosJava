import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;


public class ExercicioDataJava {
	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date x1 = new Date();
		Date x2 = new Date(System.currentTimeMillis());
		
		Date y1 = sdf1.parse("25/06/2018");
		Date y2 = sdf2.parse("25/06/2018 15:42:07");
		
		System.out.println("y1: "+ y1);
		System.out.println("y2: "+ y2);
		System.out.println("x1: "+ x1);
		System.out.println("x2: "+ x2);
	}
}
