package exam;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exam07 {

	public static void main(String[] args) {
		List<Member1> list = Arrays.asList(
			new Member1("홍길동", "개발자"),
			new Member1("김나리", "디자이너"),
			new Member1("신용권", "개발자")
		);
		
		/*
		Stream<Member1> stream = list.stream();
		Stream<Member1> filter = stream.filter(new Predicate<Member1>() {
			@Override
			public boolean test(Member1 t) {
				return t.getJob().equals("개발자");
			}
		});
		List<Member1> developer = filter.collect(Collectors.toList());
		
		/**/
		
		//*
		List<Member1> developers = list.stream()
				.filter(m -> m.getJob().equals("개발자"))
				.collect(Collectors.toList());
		developers
			.stream()
			.forEach(m -> System.out.println(m.getName()));
		/**/		
	}

}

class Member1 {
	private String name;
	private String job;
	
	public Member1(String name, String job) {
		this.name = name;
		this.job = job;
	}
	
	public String getName() { return name; }
	public String getJob() { return job; }
}