package exam10;

public class MyTv2 {
	boolean isPowerOn;
	int channel;
	int volume;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		if(channel > MAX_VOLUME || channel < MIN_VOLUME) {
			System.out.println("채널 범위에 해당하지 않습니다. 임의로 1번을 출력합니다.");
			this.channel = 1;
		} else {
			this.channel = channel;			
		}
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		if(volume > MAX_VOLUME || volume < MIN_VOLUME) {
			System.out.println("봄륨 범위에 해당하지 않습니다. 음소거를 실시합니다.");
			this.volume = 0;
		} else {
			this.volume = volume;			
		}
	}
}
