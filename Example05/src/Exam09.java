
public class Exam09 {

	public static void main(String[] args) {
		// 주어진 배열을 시계방향으로 90도 회전시켜서 출력하는 프로그램을 완성하시오.
		char[][] star = {
				{'*', '*', ' ', ' ', ' '},
				{'*', '*', ' ', ' ', ' '}, 
				{'*', '*', '*', '*', '*'},
				{'*', '*', '*', '*', '*'}
		};
		
		char[][] result = new char[star[0].length][star.length];
		
		for(int i=0; i<star.length; i++) {
			for(int j=0; j<star[i].length; j++) {
				System.out.print(star[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
		
		/*
		for(int i=star.length-1; i>=0; i--) {
			for(int j=0; j<star[i].length; j++) {
				result[j][i] = star[i][j];
			}
		}
		/**/
		
		for(int i=0; i<star.length; i++) {
			for(int j=0; j<star[i].length; j++) {
				int x=j;
				int y=star.length -1 -i;
				result[x][y] = star[i][j];
			}
		}
		
		for(int i=star.length-1; i>=0; i--) {
			for(int j=0; j<result[i].length; j++) {
				System.out.print(result[j][i]);
			}
			System.out.println();
		}

	}

}
