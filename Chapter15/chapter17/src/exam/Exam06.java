package exam;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.ToIntFunction;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Exam06 {

	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
			new Member("홍길동", 30),
			new Member("신용권", 40),
			new Member("신용권", 26)
		);
		
		/* [1]
		Stream<Member> stream = list.stream();
		IntStream intStream = stream.mapToInt(new ToIntFunction<Member>() {
			@Override
			public int applyAsInt(Member value) {
				return value.getAge();
			}
		});
		OptionalDouble optionalDouble = intStream.average();
		double avg = optionalDouble.getAsDouble();
		
		System.out.println("평균 나이: " + avg);
		/**/
		
		/* [2]
		Stream<Member> stream = list.stream();
		IntStream intStream = stream.mapToInt(Member::getAge);
		OptionalDouble optionalDouble = intStream.average();
		double avg = optionalDouble.getAsDouble();
		
		System.out.println("평균 나이: " + avg);
		/**/
		
		//*
		double avg = list.stream()
				.mapToInt(Member::getAge)
				.average()
				.getAsDouble();
		System.out.println("평균 나이: " + avg);
		/**/
	}

}

class Member {
	private String name;
	private int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() { return name; }
	public int getAge() { return age; }
}
