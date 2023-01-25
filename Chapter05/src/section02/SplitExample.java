package section02;

public class SplitExample {

	public static void main(String[] args) {
		String board = "1,자바 학습,참조 타입 String을 학습합니다.,홍길동";
		
		// 문자열 분리
		String[] tokens = board.split(",");
		// 이때 분리되면서 분리될 때마다 분리된 문자열만의 객체가 생성됨
		// tokens 인텍스[0]에 (해당하는 문자열의) 객체 주소가 저장됨. -> 모든 인덱스도 해당
		
		for(String i : tokens) {
			System.out.println(i);
		}
	}

}
