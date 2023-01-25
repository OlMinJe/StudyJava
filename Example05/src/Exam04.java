
public class Exam04 {

	public static void main(String[] args) {
		// 2차원 배열 arr에 담긴 모든 값의 총합과 평균을 구하는 프로그램을 완성하시오
		 int[][] arr = {
				 {5, 5, 5, 5, 5},
				 {10, 10, 10, 10, 10},
				 {20, 20, 20, 20, 20},
				 {30, 30, 30, 30, 30}
		 };
		 
		 int total = 0;
		 int cnt = 0;
		 float average = 0;
		 
		 
		 for(int[] i : arr) {
			 for(int j : i) {
				 total += j;
				 cnt++;
			 }
		 } // 이차원 배열을 foreach로 사용하는 방법
		 average = (float)total / cnt;
		 
		 System.out.println("total =" + total);
		 System.out.println("average =" + average);
	}

}
