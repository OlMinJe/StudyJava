package section03;

public class ArrayCreatByValueListExample2 {

	public static void main(String[] args) {
		// 배열 변수 선언
		int[] scores;
		// 배열 변수에 배열 대입 -> 배열 변수와 배열 객체는 다르기 때문에 성립하는 개념
		scores = new int[] {83, 90, 87};

		// 총합을 구하고 출력
		int sum = 0;
		for(int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("총합: " + sum);
		
		printItem(scores); // int[] arr = scores;
		System.out.println();
		printItem(new int[] {10, 20, 30, 40, 50});
		
	} // main()
	 
	public static void printItem(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.println("[" + i + "]: " + arr[i]);
		}
	}

}
