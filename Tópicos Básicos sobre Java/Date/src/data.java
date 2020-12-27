import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class data {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sf2 =  new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date y1 = new Date();
		
		Date x1 = sf1.parse("25/12/2019");
		Date x2 = sf2.parse("01/01/2020 12:00:07");
		
		System.out.println("Horário atual do Sistema: " + sf2.format(y1));
		System.out.println("X1: " + sf2.format(x1));
		System.out.println("X2: " + sf2.format(x2));
		
	}

}
