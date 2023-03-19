package section08;

import java.util.Arrays;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class LoopingExample {

	public static void main(String[] args) {
		int[] intArr = {1, 2, 3, 4, 5};
		
		// 잘못 작성
		/*
		IntStream stream = Arrays.stream(intArr);
		IntStream filter = stream.filter(new IntPredicate() {
			@Override
			public boolean test(int a) {
				return a % 2 == 0;
			}
		});
		filter.peek(new IntConsumer() {
			@Override
			public void accept(int value) {
				System.out.println(value);
				// 최종 처리가 없으므로 동작 X
			}
		});
		/**/
		Arrays.stream(intArr)
			.filter(a -> a % 2 == 0)
			.peek(value -> System.out.println(value));
		
	}

}
