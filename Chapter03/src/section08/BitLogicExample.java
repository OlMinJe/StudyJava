package section08;

public class BitLogicExample {

	public static void main(String[] args) {
		System.out.println("45 & 25 = " + (45 & 25)); // 출력 결과: 9
		/*
		  00101101  <45>
		& 00011001  <25>
		*/
		System.out.println("45 | 25 = " + (45 | 25)); // 61
		System.out.println("45 ^ 25 = " + (45 ^ 25)); // 52 => 다르면: 1(true), 같으면: 0(false)
		System.out.println("~45 = " + (~45)); // -45
		System.out.println("--------------");
		
		byte receiveData = -128;
		
		// 방법1. 비트 논리곱(and) 연산으로 Unsigned 정수 얻기
		int unsignedInt1 = receiveData & 255;
		System.out.println(unsignedInt1); // 128
		
		// 방법2. 자바 API를 이용해서 Unsigned 정수 얻기
		int unsignedInt2 = Byte.toUnsignedInt(receiveData);
		System.out.println(unsignedInt2); // 128
		
	}

}
