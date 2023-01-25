package exam;

import java.util.Scanner;

public class Example09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int studentNum = 0;
		int[] score = null;
		
		while(true) {
			System.out.println("---------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("---------------------------------------------");
			System.out.print("선택> ");
			int input = sc.nextInt();
			
			if(input == 1) {
				System.out.print("학생수> ");
				studentNum = sc.nextInt();
				score = new int[studentNum];
			}//if(input == 1)
			
			if(input == 2) {
				if(score == null) {
					System.out.println("학생 수를 먼저 설정하세요.");
					continue;
				}
				
				for(int i=0 ; i<score.length; i++) {
					System.out.print("score[" + i + "]: ");
					score[i] = sc.nextInt();
				}
			}//if(input == 2)
			
			if(input == 3) {
				for(int i=0 ; i<score.length; i++) {
					System.out.print("score[" + i + "]: " + score[i] + "\n");
				}
			}//if(input == 3)

			if(input == 4) {
				int maxScore = score[0];
				int sum = 0;
				
				for(int i=0 ; i<score.length; i++) {
					if(score[i] > maxScore) {
						maxScore = score[i];
					}
					sum += score[i];
				}
				System.out.println("최고 점수: " + maxScore);
				System.out.printf("평균 점수: %.2f\n", (double)sum/score.length);
			}//if(input == 4)
			
			if(input == 5){
				System.out.println("프로그램 종료");
				break;
			}//if(input == 5)
		}

	}

}
