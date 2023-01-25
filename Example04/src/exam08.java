// 조금 어려웠음
public class exam08 {
	public static void main(String[] args) {		 
		 for(int i = 0; i <= 10; i++) {
			 for(int j = 0; j <= 10; j++) {
				 if(((2*i) + (4*j)) == 10) {
					 System.out.print("x  : " + i + ", y  : " + j);					 
				 }
			 }
			 System.out.println();
		 }
	}
}