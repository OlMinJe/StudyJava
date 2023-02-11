package section10;

public class InstanceofExample {
	public static void main(String[] args) {
		// Person 객체를 매개값으로 제공하고 personInfo() 메소드 호출
		Person p1 = new Person("홍길동");
		personInfo(p1);
		
		System.out.println();
		
		// Student 객체를 매개밧으로 제공하고 personInfo() 메소드 호출
		Person p2 = new Student("김길동", 10);
		personInfo(p2);
	}
	
	// main() 메소드에서 바로 호출하기 위해 정적 메소드 선언
	public static void personInfo(Person person) {
		System.out.println("name: " + person.name);
		person.walk();
		
		// 매개값이 Student인 경우에만 강제 타입 변환해서 studentNo 필드와 study() 메소드 사용
		if(person instanceof Student) {
			// Student 객체일 경우 강제 타입 변환
			Student student = (Student) person; // -> 오버라이드를 안 한 경우에 형변환 해줘서 가져와야 한다.
			
			// Student 객체만 가지고 있는 필드 및 메소드 사용
			System.out.println("studentNo: " + student.studentNo);
			student.study();
		}
	}
}
