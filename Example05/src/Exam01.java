
public class Exam01 {

	public static void main(String[] args) {
		// 다음은 배열을 선언하거나 초기화한 것이다.
		// 잘못된 것을 고르고 그 이유를 설명하시오
		
		// 1번
		//int[] arr[]; // []기호의 위치가 잘못됨
		//int[] arr; // 로 선언해야한다.
		
		// 2번
		//int[] arr = {1,2,3,}; // 초기화 값 사이 콜론이 하나 더 추가됨,
		
		// 3번
		int[] arr = new int[5]; 
		
		// 4번
		//int[] arr = new int[5] {1,2,3,4,5};
		// 배열의 크기 선언과 초기화과 동시에 이루어지면 안 된다.
		
		// 5번
		//int[] arr[] = new int[3][]; 
		// 2차원 배열 선언은 int[][] arr = new int[3][]; 의 형식으로 해야한다.
	}

}
