import java.util.Calendar;

public class Exam05 {
	public static int getDayDiff(String yyyymmdd1, String yyyymmdd2) {
		try {
			int year1 = Integer.parseInt(yyyymmdd1.substring(0, 4));
			int month1 = Integer.parseInt(yyyymmdd1.substring(4, 6));
			int day1 = Integer.parseInt(yyyymmdd1.substring(6, 8));
			
			int year2 = Integer.parseInt(yyyymmdd2.substring(0, 4));
			int month2 = Integer.parseInt(yyyymmdd2.substring(4, 6));
			int day2 = Integer.parseInt(yyyymmdd2.substring(6, 8));
			
			Calendar date1 = Calendar.getInstance();
			Calendar date2 = Calendar.getInstance();
		
			date1.set(year1, month1 - 1, day1);
			date1.set(year2, month2 - 1, day2);
			
			int diff = (int) (date1.getTimeInMillis() - date2.getTimeInMillis() + 1000) / (24*60*60*1000);
			
			return diff;
		} catch (Exception e) {
			return 0;
		}	
	}
	
	public static void main(String[] args) {
		System.out.println(getDayDiff("20210103", "20010101"));
		System.out.println(getDayDiff("20210103", "20010103"));
		System.out.println(getDayDiff("20210103", "200103"));
	}

}
