import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Exam08 {
	public static void main(String[] args) {
		ZonedDateTime seoulZdt = ZonedDateTime.now();
		
		ZoneId nyId = ZoneId.of("America/New_York");
		ZonedDateTime nyZdt = ZonedDateTime.now().withZoneSameInstant(nyId);
		
		System.out.println(seoulZdt);
		System.out.println(nyZdt);
		
		long seoulSec = seoulZdt.getOffset().getTotalSeconds();
		long nySec = nyZdt.getOffset().getTotalSeconds();
		long diff = (seoulSec - nySec) / (60*60);
		
		System.out.println("seoulSec = " + seoulSec);
		System.out.println("nySec = " + nySec);
		System.out.println("diff = " + diff + " hrs");
	}
}
