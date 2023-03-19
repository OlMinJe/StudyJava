package section06.exam03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FlatMappingExample {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		list1.add("this is java");
		list1.add("i am a best developer");
		
		// [1]
		/*
		Stream<String> stream = list1.stream();
		Stream<String> map = stream.flatMap(new Function<String, Stream<String>>() {
			@Override
			public Stream<String> apply(String data) {
				String[] strArray = t.split(" ");
				Stream<String> stream = Arrays.stream(strArray);
				return stream;
			}
		});
		
		map.forEach(new Consumer<String>() {
			@Override
			public void accept(String word) {
				System.out.println(word);
			}
		});
		/**/
		/*
		Stream<String> stream = list1.stream();
		Stream<String> map = stream.flatMap(data -> Arrays.stream(data.split(" ")));
		map.forEach(word -> System.out.println(word));
		/**/
		
		list1.stream()
			.flatMap(data -> Arrays.stream(data.split(" ")))
			.forEach(t -> System.out.println(t));
		System.out.println();
		
		// [2]
		List<String> list2 = Arrays.asList("10, 20, 30", "40, 50");
		
		/*
		Stream<String> stream = list2.stream();
		IntStream intStream = stream.flatMapToInt(new Function<String, IntStream>() {
			@Override
			public IntStream apply(String data){
				String[] strArray = data.split(",");
				int[] intArray = new int[strArray.length];
				for(int i = 0; i < strArray.length; i++) {
					intArray[i] = Integer.parseInt(strArray[i].trim());
				}
				return Arrays.stream(intArray); // intArray를 stream 타입으로 바꿔서 보낸다.
			}
		});
		intStream.forEach(new IntConsumer() {
			
			@Override
			public void accept(int value) {
				System.out.println(value);
			}
		});
		/**/
		/* 얘가 밑의 코드보다 더 명확하게 알 수 있다.
		Stream<String> stream = list2.stream();
		IntStream intStream = stream.flatMapToInt(data -> {
				String[] strArray = data.split(",");
				int[] intArray = new int[strArray.length];
				for(int i = 0; i < strArray.length; i++) {
					intArray[i] = Integer.parseInt(strArray[i].trim());
				}
				return Arrays.stream(intArray);
		});

		intStream.forEach(value -> System.out.println(value));
		/**/
		list2.stream()
			.flatMapToInt(data -> {
				String[] strArray = data.split(",");
				int[] intArray = new int[strArray.length];
				for(int i = 0; i < strArray.length; i++) {
					intArray[i] = Integer.parseInt(strArray[i].trim());
				}
				return Arrays.stream(intArray);
			})
			.forEach(value -> System.out.println(value));
	}

}
