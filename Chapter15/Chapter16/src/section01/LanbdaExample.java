package section01;

public class LanbdaExample {

	public static void main(String[] args) {
		/* 람다식 적용 전(1)
		Calculable calPlus = new CalPlus();
		Calculable calMinus = new CalMinus();		
		
		action(calPlus);
		action(calMinus);
		/**/
		
		
		/* <람다식 적용 순서 - 1>
		Calculator calPlus = new Calculator() {
			@Override
			void Calculator(int x, int y) { // 익명 객체
				int result = x + y;
				System.out.println(result);
			}
		}
		/**/
		
		/* <람다식 적용 순서 - 2>
		Calculable calPlus = (x, y) -> {
			int result = x + y;
			System.out.println("result: " + result);
		};
		/**/
		
		//* 람다식 적용
		action((x, y) -> {
			int result = x + y;
			System.out.println("result: " + result);
		});
		
		action((x, y) -> {
			int result = x - y;
			System.out.println("result: " + result);
		});
		/**/
	}
	
	public static void action(Calculable calculable) {
		int x = 10;
		int y = 4;
		
		calculable.calculate(x, y);
	}
}

/* 람다식 적용 전(1)
class CalPlus implements Calculable {
	@Override
	public void calculate(int x, int y) {
		int result = x + y;
		System.out.println(result);
	}
}

class CalMinus implements Calculable {
	@Override
	public void calculate(int x, int y) {
		int result = x - y;
		System.out.println(result);
	}
}
/**/