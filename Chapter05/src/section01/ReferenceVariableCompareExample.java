package section01;
public class ReferenceVariableCompareExample {
	// 참조 변수 비교 예제
	
	public static void main(String[] args) {
		int[] arr1; // 정수형 배열 변수 arr1 선언
		int[] arr2;
		int[] arr3;
		
		arr1 = new int[] {1, 2, 3}; // 배열 객체 생성하고 주소를 arr1에 대입
		arr2 = new int[] {1, 2, 3};
		arr3 = arr2; // 객체의 주소를 저장한다.
		
		System.out.println(arr1 == arr2); // false -> 객체가 다르기 때문에 
		System.out.println(arr2 == arr3); // true -> 참조한 객체가 같기 때문에
	}
}
