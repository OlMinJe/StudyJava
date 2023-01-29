package section01;

public class SmartPhoneExample {

	public static void main(String[] args) {
		// smartphone 객체 생성
		SmartPhone myPhone = new SmartPhone("아이폰", "용달블루");

		System.out.println("모델: " + myPhone.model);
		System.out.println("색상: " + myPhone.color);
		System.out.println("와이파이 상태: " + myPhone.wifi);
		
		myPhone.bell();
		myPhone.sendVoice("여보세요.");
		myPhone.receiveVoice("안녕하세여~ 감사해여~ 잘있어여~ 다싀 만나여~");
		myPhone.sendVoice("아~ 네~ ㅎㅇ");
		myPhone.hangUp();
		
		myPhone.setWifi(true);
		myPhone.internet();
	}

}
