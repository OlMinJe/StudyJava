package section07;

import java.util.Calendar;

public class WeekExample {

	public static void main(String[] args) {
		// week 열거 타입 변수 선언
		Week today = null;
		
		// Calender 열기
		Calendar cal = Calendar.getInstance(); 
		// calender는 new와 다르게 하나의 객체만 사용할 수 있도록 한다.
		
		// 오늘의 요일 열기(1~7)
		int week = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(week);
		
		// 숫자를 열거 상수로 변환해서 변수에 대입
		switch (week) {
		case 1: today = Week.SUNDAY; break;
		case 2: today = Week.MONDAY; break;
		case 3: today = Week.THESDAY; break;
		case 4: today = Week.WEDNEDAY; break;
		case 5: today = Week.THURSDAY; break;
		case 6: today = Week.FRIDAY; break;
		default: today = Week.SATURDAY; break;
		}
		
		// 열거 타입 변수 사용
		if(today == Week.SUNDAY) { System.out.println("일요일에는 축구를 합니다."); }
		else { System.out.println("힘들게 자바를 공부합니다."); }
	}

}
