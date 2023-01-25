
public class exam04 {

	public static void main(String[] args) {
		// 1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때, 몇 까지 더해야 총합이 100이상 되는지 구하시오
		/*
		int sum = 0;
		
		int i = 1;
		int sign = 1;
		
		while (sum < 100) {
			sum += sign * i;
			System.out.println(i + "," +sum);
			i++;
			sign *= -1;
		}
		System.out.println(i);
		*/

		int sum = 0;
		int sign = 1;
		int num = 0;
		
		for(int i = 1; true; i++) {
			num = sign * i;
			sum += num;
			
			if(sum >= 100) {
				break;
			}
			sign = -sign;
		}
		
		System.out.println("num = " + num);
		System.out.println("sum = " + sum);
	}
	
	

}
