package section03;

import java.util.Scanner;

public class ArrayCreateByValueListExample {

	public static void main(String[] args) {
		// 배열 변수 선언 및 배열 생성
		String[] season = {"Spring", "Summer", "Fall", "Winter"};
		
		// 배열의 요소값 읽기
		for(String seasones : season) {
			System.out.println(seasones);			
		}
		
		// 1번 인덱스 값 변경
		season[1] = "여름";
		System.out.println(season[1]);
		
		// 배열 변수 선언 및 배열 생성
		int[] score = {83, 90, 87};
		
		// 총합, 평균 구하기
		int sum = 0;
		for(int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		System.out.println("총점: " + sum);
		System.out.println("평균: " + sum/3.0);
		
	}

}
