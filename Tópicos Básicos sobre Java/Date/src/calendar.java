import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class calendar {

	public static void main(String[] args) {
		SimpleDateFormat sfd = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date d = Date.from(Instant.parse("2019-12-25T15:42:07Z"));
		
		System.out.println(sfd.format(d));
		
		//Exemplo para add hora,minuto,segundo ou dia
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.add(Calendar.HOUR_OF_DAY, 4); 
		d = cal.getTime();
		
		System.out.println(sfd.format(d));
		
		int minute = cal.get(Calendar.MINUTE);
		int mes = 1 + cal.get(Calendar.MONTH);//Mês no calendar começa com zero, por isso soma +1!
		
		System.out.println("Minutos: " + minute);
		System.out.println("Mes: " + mes);
		
	}

}
