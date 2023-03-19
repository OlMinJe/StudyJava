package section07.exam02;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

import section07.Student;

public class SortingExample {

	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student("홍길동", 30));
		studentList.add(new Student("신용권", 10));
		studentList.add(new Student("유미선", 20));
		
		/*
		Stream<Student> stream = studentList.stream();
		Stream<Student> sorted = stream.sorted(new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.getScore() - o2.getScore();
			}
		});
		sorted.forEach(new Consumer<Student>() {
			@Override
			public void accept(Student s) {
				System.out.println(s.getName() + ": " + s.getScore());
			}
		});
		/**/
		
		studentList.stream()
			.sorted((o1, o2) ->  o1.getScore() - o2.getScore())
			.forEach(s -> System.out.println(s.getName() + ": " + s.getScore()));
		
		System.out.println();
		
		studentList.stream()
		.sorted((o1, o2) ->  o2.getScore() - o1.getScore())
		.forEach(s -> System.out.println(s.getName() + ": " + s.getScore()));
	
	
	}
}
