package exam;

public class Example07 {

	public static void main(String[] args) {
		// 주어진 배열 항목에서 최대값을 출력하는 코드를 작성해보세요
		int[] array = {1, 5, 3, 8, 2};
		int max = array[0];
		
		for(int i=0; i<array.length; i++) {
			if(array[i] > max) {
				max = array[i];
			}
		}
		System.out.println("최대값은 : " +  max);
	}

}
