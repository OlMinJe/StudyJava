package section04;

public class MultidimensionalArrayByNewExample {

	public static void main(String[] args) {
		// 각 반의 학생수가 3명으로 동일할 경우 점수 저장을 위한 2차원 배열 생성
		int [][] mathScores = new int[2][3];
		// 배열 항목의 초기값을 출력
		for(int i=0; i<mathScores.length; i++) {
			for(int k=0; k<mathScores[i].length; k++) {
				System.out.println("mathScores[" + i + "][" + k + "]: " + mathScores[i][k]);
			}
		}
		
		// 배열 항목 값 변경
		mathScores[0][0] = 80;
		mathScores[0][1] = 83;
		mathScores[0][2] = 85;
		mathScores[1][0] = 86;
		mathScores[1][1] = 90;
		mathScores[1][2] = 92;
		
		int totalStudent = 0;
		int totalMathSum = 0;
		for(int i=0; i<mathScores.length; i++) {
			totalStudent += mathScores[i].length;
			
			for(int k=0; k<mathScores[i].length; k++) {
				totalMathSum += mathScores[i][k];
			}
		}
		double totalMathAvg = (double)totalMathSum/totalStudent;
		System.out.println("전체 학생의 수학 평균 점수: " + totalMathAvg);
		System.out.println();
		
		// 각 반의 학생 수가 다를 경우 점수 저장을 위한 2차원 배열 생성
		int[][] engScores = new int[2][];
		engScores[0] = new int[3];
		engScores[1] = new int[2];
		// 배열 항목 초기값 출력
		for(int i=0; i<engScores.length; i++) {
			for(int k=0; k<engScores[i].length; k++) {
				System.out.println("engScores[" + i + "][" + k + "]: " + engScores[i][k]);
			}
		}
		// 배열 항목 값 변경
		engScores[0][0] = 90;
		engScores[0][1] = 91;
		engScores[0][2] = 92;
		engScores[1][0] = 93;
		engScores[1][1] = 94;
		// 전체 학생의 영어 평균 구하기
		totalStudent = 0;
		int totalEngSum = 0;
		for(int i=0; i<engScores.length; i++) {
			totalStudent += engScores[i].length;
			
			for(int k=0; k<engScores[i].length; k++) {
				totalEngSum += engScores[i][k];
			}
		}
		double totalEngAvg = (double)totalEngSum/totalStudent;
		System.out.println("전체 학생의 영어 평균 점수: " + totalEngAvg);
		
	} // main(String[] args)

} //class MultidimensionalArrayByNewExample
