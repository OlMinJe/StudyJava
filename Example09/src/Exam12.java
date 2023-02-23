/*
 * 메서드명 : getRand
기 능 : 주어진 범위(from~to)에 속한 임의의 정수값을 반환한다. 
(양쪽 경계값 모두 범위에 포함)
from의 값이 to의 값보다 클 경우도 처리되어야 한다. 반환타입 : int
매개변수 : int from - 범위의 시작값
int to - 범위의 끝값
*/

class Exam12 {

	public static void main(String[] args) {
		for(int i = 0; i < 20; i++) {
			System.out.print(getRand(1, -3) + ",");
		}
	}
	
	public static int getRand(int from, int to) {
		/*
		if(from > to) {
			int tmp = from;
			from = to;
			to = tmp;
		}
		
		int rand = (int)(Math.random() * (to - from + 1)) + from;
		return rand;
		*/
		return (int)(Math.random() * (Math.abs(to - from) + 1)) + Math.min(from, to);
	}

}
