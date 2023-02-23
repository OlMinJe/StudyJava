package section05;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {

	public static void main(String[] args) {
		// 선택 번호
		int[] selectNumber = new int[6];
		/*
		 * 당첨 번호가 계속 같은 이유는 seed때문이다
		 * 밑의 당첨 번호에 같은 seed 값을 넣으면 같은 번호가 나온다.
		 * Random random = new Random(3);
		 * */
		Random random = new Random(); // Random 객체 생성
		System.out.println("선택번호: ");
		
		for(int i = 0; i < 6; i++) {
			selectNumber[i] = random.nextInt(45) + 1;
			System.out.print(selectNumber[i] + " ");
		}
		System.out.println();
		
		// 당첨번호 
		int[] winninNumber = new int[6];
		random = new Random();
		System.out.println("당첨 번호: ");
		
		for(int i = 0; i < 6; i++) {
			winninNumber[i] = random.nextInt(45) + 1;
			System.out.print(winninNumber[i] + " ");
		}
		System.out.println();
		
		// 당첨 여부
		Arrays.sort(selectNumber); // 배열 항목 정렬
		Arrays.sort(winninNumber);
		boolean result = Arrays.equals(selectNumber, winninNumber);
		System.out.println("당첨 여부:");
		if(result) {
			System.out.println("1등에 당첨되셨습니다.");
			for(int winner : winninNumber) {
				System.out.print(winner + " ");
			}
		} else {
			System.out.println("낙첨");
		}
	}

}
