// 종이대로 띄어쓰는게 좀 어렵네
public class exam12 {

	public static void main(String[] args) {	
		//* 내 코드
		for(int i = 1; i <= 9; i+=3 ) {
			for(int j = 1; j <= 3; j++) {
				for(int k = i ; k <= i+2; k++) {
					System.out.print(k + "*" + j + "=" + k*j + "\t");
				}
				System.out.println();
			}
			System.out.println();
		}
		/**/
		
		/* 강사님 코드
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= 3; j++) {
				int x = (j+1) + (i-3)/3*3;
				int y = (i%3 == 0) ? 3 : (i%3);
				
				if(x>9) {
					
				}
				
				System.out.print(x + "*" + y + "=" + x*y + "\t");
			}
			System.out.println();
			
			if(i%3 == 0) {
				System.out.println();
			}
		}
		*/
	}
	
}
