import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/*자신이 태어난 날부터 지금까지 며칠이 지났는지 계산해서 출력하시오.*/

public class Exam06 {

	public static void main(String[] args) {
		LocalDate birthDay = LocalDate.of(2000, 2, 29);
		LocalDate now = LocalDate.now();
		
		long days = birthDay.until(now, ChronoUnit.DAYS);
		
		System.out.println("birthday = " + birthDay);
		System.out.println("today = " + now);
		System.out.println(days + "days");
	}

}
