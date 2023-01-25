package section04;

public class ArrayCopyByForExample {

	public static void main(String[] args) {
		// 길이가 3인 배열
		int[] oldIntArray = {1, 2, 3};
		// 길이가 5인 배열을 새로 생성
		int[] newIntArray = new int[5];
		
		/* 배열 항목을 복사
		for(int i = 0; i < oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
		}
		
		for(int i = 0; i <newIntArray.length; i++) {
			System.out.println(newIntArray[i]);			
		}
		/**/
		
		System.arraycopy(oldIntArray, 0, newIntArray, 1, oldIntArray.length);
		// 내부적으로는 for문이 들어가 있다고 생각하면 이해하기 쉬움
		for(int i = 0; i <newIntArray.length; i++) {
			System.out.println(newIntArray[i]);			
		}
	}

}
