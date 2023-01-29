package section09;

public class SingletonExample {

	public static void main(String[] args) {
		// Sigleton obj1 = new Singleton(); // 메서드를 찾을 수 없는 에러가 뜸
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("같은 Singleton 객체입니다.");
		} else {
			System.out.println("다른 Singleton 객체입니다");
		}
		
		System.out.println("obj1.value: " + obj1.getValue()); // 0
		System.out.println("obj2.value: " + obj2.getValue()); // 0
		
		obj1.setValue(10);
		System.out.println("obj1.value: " + obj1.getValue()); // 10
		System.out.println("obj2.value: " + obj2.getValue()); // 10
		
		obj2.setValue(50);
		System.out.println("obj1.value: " + obj1.getValue()); // 50
		System.out.println("obj2.value: " + obj2.getValue()); // 50
	}

}
