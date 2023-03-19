package section05;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class FilteringExample {

	public static void main(String[] args) {
		// List 컬렉션 생성
		List<String> list = new ArrayList<>();
		list.add("홍길동");
		list.add("신용권");
		list.add("감자바");
		list.add("신용권");
		list.add("신말철");
		
		// 중복 요소 제거
		list.stream().distinct().forEach(n -> System.out.println(n));
		System.out.println();

		/* [1]
		Stream<String> stream = list.stream();
		
		Stream<String> filteringStream = stream.filter(new Predicate<String>() {
			@Override
			public boolean test(String name) {
				return name.startsWith("신");
			}
			
		});
		
		filteringStream.forEach(new Consumer<String>() {
			@Override
			public void accept(String name) {
				System.out.println(name);
			}
		});
		/**/
		Stream<String> stream = list.stream();
		Stream<String> fileteringStream = stream.filter(name -> name.startsWith("신"));
		fileteringStream.forEach(name -> System.out.println(name));
		
		
		// 신으로 시작하는 요소만 필터링
		list.stream()
			.filter(n -> n.startsWith("신"))
			.forEach(n -> System.out.println(n));
		System.out.println();
		
		
		/* [2] - 1
		Stream<String> stream = list.stream();
		Stream<String> distinct = stream.distinct();
		distinct.filter(new Predicate<String>() {
			@Override
			public boolean test(String name) {
				return name.startsWith("신");
			}
		});
		*/
		/* [2] - 2 줄이고 대신 넣다보면 줄여진다.
		Stream<String> stream = list.stream();
		Stream<String> distinct = stream.distinct();
		Stream<String> filter = distinct.filter(name -> name.startsWith("신"));
		filter.forEach(new Consumer<String>() {
			@Override
			public void accept(String name) {
				System.out.println(name);
			}
		});
		*/
		// 중복 요소를 먼저 제거하고, 신으로 시작하는 요소만 필터링
		list.stream().distinct()
			.filter(n -> n.startsWith("신"))
			.forEach(n -> System.out.println(n));
	}

}
