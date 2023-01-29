package section02;

public class SmartPhoneExample {

	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("아이폰", "용달블루");
		
		System.out.println("모델: " + myPhone.model);
		System.out.println("색상: " + myPhone.color);
	}

}
