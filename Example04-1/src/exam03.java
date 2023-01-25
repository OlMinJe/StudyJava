
public class exam03 {
	public static void main(String[] args) {
		// 1+(1+2)+(1+2+3)+(1+2+3+4)+...(1+2+3+..+10)의 결과를 계산하시오
		int sum = 0;
		
		for(int i = 1; i <=10; i++) {
			int subSum = 0;
			for(int j = 1; j <= i; j++) {
				subSum += j;
			}
			sum += subSum;
		}
		
		System.out.println("최종합 : " + sum);
	}
}
