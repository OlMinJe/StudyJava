package exam;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Exam05 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList(
				"This is a java book",
				"Lambda Expressions",
				"Java8 supports lambda expressions"
			);
		
		/*
		Stream<String> stream = list.stream();
		Stream<String> filter = stream.filter(new Predicate<String>() {
			
			@Override
			public boolean test(String t) {
				return t.toLowerCase().contains("java"); // 포함된 것을 확인하기 위해서
			}
		});
		filter.forEach(new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		});
		/**/
		
		//*
		list.stream()
			.filter(a -> a.toLowerCase().contains("java"))
			.forEach(a -> System.out.println(a));
		/**/
	}

}
