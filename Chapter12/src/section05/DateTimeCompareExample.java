package section05;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateTimeCompareExample {
	public static void main(String[] args) {
		LocalDateTime start = LocalDateTime.now();
		LocalDateTime end = LocalDateTime.of(2023, 06, 30, 17, 40, 0);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd aHH:mm:ss");
		
		System.out.println("시작일: " + start.format(dtf));
		System.out.println("수료일: " + end.format(dtf));
		
		System.out.println("남은 해: " + start.until(end, ChronoUnit.YEARS)); // 열거형
		System.out.println("남은 월: " + start.until(end, ChronoUnit.MONTHS));
		System.out.println("남은 일: " + start.until(end, ChronoUnit.DAYS));
		System.out.println("남은 시간: " + start.until(end, ChronoUnit.HOURS));
		System.out.println("남은 분: " + start.until(end, ChronoUnit.MINUTES));
		System.out.println("남은 초: " + start.until(end, ChronoUnit.SECONDS));
	}
}
