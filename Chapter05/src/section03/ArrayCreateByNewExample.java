package section03;

public class ArrayCreateByNewExample {

	public static void main(String[] args) {
		// int 타입 배열
		int[] arr1 = new int[3];
		printItem(arr1);
	
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		printItem(arr1);
		
		// double 타입 배열
		double[] arr2 = new double[3];
		printItem(arr2);
		
		arr2[0] = 0.1;
		arr2[1] = 0.2;
		arr2[2] = 0.2;
		printItem(arr2);
		
		String[] arr3 = new String[3];
		printItem(arr3);
		
		// 참조타입
		// 인덱스 0번에 변수가 저장되어 있는 본체의 주소가 적혀있음.
		// 이거를 참조 값이라고 한다. -> 처음에는 NULL이 있음
		arr3[0] = "1월";
		arr3[1] = "2월";
		arr3[2] = "3월";
		printItem(arr3);
		
		
		// boolean 타입 배열
		boolean[] arr4 = new boolean[3];
		printItem(arr4);		
	}
	
	public static void printItem(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] = " + arr[i]);
		}
		System.out.println();
	}
	
	public static void printItem(double[] arr) { // 메서드 오버로딩
		for(int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] = " + arr[i]);
		}
		System.out.println();
	}
	
	public static void printItem(boolean[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] = " + arr[i]);
		}
		System.out.println();
	}
	
	public static void printItem(String[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] = " + arr[i]);
		}
		System.out.println();
	}
}
