package section05;

//import java.util.Iterator;
import java.util.TreeSet;

public class ComparableExample {

	public static void main(String[] args) {
		// TreeSet 컬렉션 생성
		TreeSet<Person> treeSet = new TreeSet<Person>();

		treeSet.add(new Person("홍길동", 45));
		treeSet.add(new Person("김자바", 25));
		treeSet.add(new Person("박지원", 31));
		
		/*
		Iterator<person> 으로도 사용 가능하다.
		/**/
		
		for(Person person : treeSet) {
			System.out.println(person.name + ": " + person.age);
		}
		
	}

}
