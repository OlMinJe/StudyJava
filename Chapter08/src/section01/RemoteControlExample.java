package section01;

public class RemoteControlExample {

	public static void main(String[] args) {
		// 인터페이스 변수 선언
		RemoteControl rc;
		
		// Television 객체를 생성하고 인터페이스 변수에 대입
		rc = new Television();
		rc.trunOn();
		rc.setVolume(5);
		
		// 디폴트 메소드 호출
		rc.setMute(true);
		rc.setMute(false);
		
		// 23.02.01 디폴트 메서드 추가
		System.out.println();
		
		// audio 객체를 생성하고 인터페이스 변수에 대입
		rc = new Audio();
		rc.trunOn();
		rc.setVolume(5);
		
		// 디폴트 메서드 호출
		rc.setMute(true);
		rc.setMute(false);
		
		// 정적메서드 호
		RemoteControl.changeBattery();
	}

}
