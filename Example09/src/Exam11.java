
public class Exam11 {
	
	public static void main(String[] args) {
		int start = 0;
		int end = 0;
		
		try {
			if(args.length != 2) {
				throw new Exception("시작 단과 끝 단, 두 개의 정수를 입력해주세요.");
			}			
			
			start = Integer.parseInt(args[0]);
			end = Integer.parseInt(args[1]);
			
			if(start > end) {
				int temp =start;
				start = end;
				end = temp;
			}
		} catch(NumberFormatException e) {
			System.err.println(e.getMessage());
			System.err.println("정수로 입력하셔야 합니다.");
			System.out.println("입력 예씨: 3 5");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("입력 예시: 3 5");
			System.exit(0);
		}
		
		for(int i = start; i <= end; i++) {
			for(int k = 1; k <= 9; k++) {
				System.out.println(i + "*" + k + "=" + i*k);
			}
			System.out.println();
		}
	}
}