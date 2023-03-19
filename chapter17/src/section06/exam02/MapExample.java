package section06.exam02;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MapExample {

	public static void main(String[] args) {
		int[] intArray = { 1, 2, 3, 4, 5 };
		
		// [1]
		/*
		IntStream intStream = Arrays.stream(intArray);
		DoubleStream doubleStream = intStream.asDoubleStream();
		doubleStream.forEach(new DoubleConsumer() {
			@Override
			public void accept(double value) {
				System.out.println(value);
			}
		});
		*/
		
		/*
		IntStream intStream = Arrays.stream(intArray);
		DoubleStream doubleStream = intStream.asDoubleStream();
		doubleStream.forEach(value -> System.out.println(value));
		*/
		
		Arrays.stream(intArray)
			.asDoubleStream()
			.forEach(value -> System.out.println(value));
		
		System.out.println();
		
		
		// [2]
		/*
		IntStream intStream = Arrays.stream(intArray);
		Stream<Integer> streamInteger = intStream.boxed();
		streamInteger.forEach(new Consumer<Integer>() {
			@Override
			public void accept(Integer t) {
				System.out.println(t);
			}
		});
		/**/
		Arrays.stream(intArray)
			.boxed()
			.forEach(t -> System.out.println(t));		
	}

}
