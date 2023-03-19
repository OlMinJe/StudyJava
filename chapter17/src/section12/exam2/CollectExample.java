package section12.exam2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectExample {

	public static void main(String[] args) {
		List<Student> totalList = new ArrayList<>();
		totalList.add(new Student("홍길동", "남", 92));
		totalList.add(new Student("김수영", "여", 87));
		totalList.add(new Student("김자바", "남", 95));
		totalList.add(new Student("오혜영", "여", 93));

		/*
		Map<String, Double> map = totalList.stream()
			.collect(
				Collectors.groupingBy(
						s -> s.getSex(), 
						Collectors.averagingDouble(s -> s.getScore()))
				);	
		*/
		Map<String, Double> map = totalList.stream()
			.collect(
				Collectors.groupingBy(
						Student::getSex, // 메서드 참조 기법을 이용함 
						Collectors.averagingDouble(Student::getScore))
				);	
			
		
		System.out.println(map);
	}

}
