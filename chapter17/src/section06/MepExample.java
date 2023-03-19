package section06;

import java.util.ArrayList;
import java.util.List;
import java.util.function.ToIntFunction;
import java.util.stream.Stream;

public class MepExample {

	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student("홍길동", 85));
		studentList.add(new Student("홍길동", 92));
		studentList.add(new Student("홍길동", 87));
		
		/* [1]
		Stream<Student> stream = studentList.stream();
		stream.mapToInt(new ToIntFunction<Student>() {
			@Override
			public int applyAsInt(Student student) {
				return student.getScore();
			}
		});
		scoreStream.forEach(new IntConsumer() {
			@Override
			public void accept(int socre) {
				System.out.println(score);
			}
		});
		/**/
		
		/* [2]
		Stream<Student> stream = studentList.stream();
		IntStream scoreStream = stream.mapToInt(student -> student.getScore());
		scoreStream.forEach(socre -> System.out.println(score));
		/**/
		
		studentList.stream()
			.mapToInt(student -> student.getScore())
			.forEach(score -> System.out.println(score));
	}

}
