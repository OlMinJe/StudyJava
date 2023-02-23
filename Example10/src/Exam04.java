import java.text.*;
import java.util.Date;
import java.util.Scanner;

/*04. 화면으로부터 날짜를 “2007/05/11”의 형태로 입력받아서 무슨 요일인지 출력하는 프로그램을 작성
하시오. 단, 입력된 날짜의 형식이 잘못된 경우 메세지를 보여주고 다시 입력받아야 한다.*/

public class Exam04 {

	public static void main(String[] args) {
		// 입력 포멧
		DateFormat inFormat = new SimpleDateFormat("yyyy/MM/dd");
		// 출력 포멧
		DateFormat outFormat = new SimpleDateFormat("입력하신 날짜는 E요일 입니다.");
		
		Scanner sc = new Scanner(System.in);
		
		Date inDate = null;
		
		do {
			System.out.println("날짜를 yyyy/MM/dd의 형태로 입력해주세요.(입력예:2007/05/11)");
			System.out.print(">>");
			
			String input = sc.nextLine();
			try {
				inDate = inFormat.parse(input);				
				break;
			} catch (Exception e) {}
		} while(true);
		
		System.out.println(outFormat.format(inDate));
	}
}
