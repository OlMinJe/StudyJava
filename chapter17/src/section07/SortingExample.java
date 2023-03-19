package section07;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class SortingExample {

	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student("홍길동", 30));
		studentList.add(new Student("신용권", 10));
		studentList.add(new Student("유미선", 20));

		/*
		Stream<Student> stream = studentList.stream();
		Stream<Student> sorted = stream.sorted();
		sorted.forEach(new Consumer<Student>() {
			@Override
			public void accept(Student s) {
				System.out.println(s.getName() + ": " + s.getScore());
			}
		});
		/**/
		
		// 오름차순 정렬
		studentList.stream()
			.sorted()
			.forEach(s -> System.out.println(s.getName() + ": " + s.getScore()));
		System.out.println();
		
		// 내림차순 정렬
		studentList.stream()
		.sorted(Comparator.reverseOrder())
		.forEach(s -> System.out.println(s.getName() + ": " + s.getScore()));
	}

}
