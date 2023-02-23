import java.time.*;
import static java.time.DayOfWeek.*;
import static java.time.temporal.TemporalAdjusters.*;


/*2016년 12월 네번째 화요일의 날짜를 아래의 실행결과와 같은 형식으로 출력하시오.
<실행결과>
2016-12-27
*/

public class Exam07 {

	public static void main(String[] args) {
	
		LocalDate date = LocalDate.of(2016, 12, 1);
		
		System.out.println(date.with(dayOfWeekInMonth(4, TUESDAY)));
	}

}
