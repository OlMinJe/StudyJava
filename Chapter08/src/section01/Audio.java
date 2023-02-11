package section01;

public class Audio implements RemoteControl {
	int volume;

	@Override
	public void trunOn() {
		System.out.println("오디오를 켭니다.");

	}

	@Override
	public void trunOff() {
		System.out.println("오디오를 끕니다.");		
	}

	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			volume = RemoteControl.MAX_VOLUME;
		} else if(volume < RemoteControl.MIN_VOLUME) {
			volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 Audio 볼륨: " + this.volume);
	}

	// 정적 메소드는 구현 객체가 없어도 인터페이스만으로 호출할 수 있다.
	// 선언 방법은 클래스 정적 메소드와 완전 동일하다.
	private int memoryVolumn;
	
	// 디폴트 메서드 재정의 
	@Override
	public void setMute(boolean mute) {
		//RemoteControl.super.setMute(mute);
		if(mute) {
			this.memoryVolumn = this.volume;
			System.out.println("무음처리");
			setVolume(MIN_VOLUME);
		} else {
			System.out.println("무음해제");
			setVolume(this.memoryVolumn);
		}
	}
	
	
}
