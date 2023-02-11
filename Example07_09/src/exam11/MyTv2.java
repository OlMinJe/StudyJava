package exam11;

public class MyTv2 {
	boolean isPowerOn;
	int channel;
	int volume;
	int beforeChannel;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		if(channel > 100 || channel < 1) {
			return;
		} 
		
		this.beforeChannel = this.channel;
		this.channel = channel;			
	}
	
	public int getVolume() {
		return volume;
	}
	
	public void setVolume(int volume) {
		if(volume > 100 || volume < 0) {
			return;
		} 
		
		this.volume = volume;			
	}
	
	public void gotoPrevChannel() {
		setChannel(this.beforeChannel);
		
		int temp = this.channel;
		this.channel = this.beforeChannel;
		this.beforeChannel = temp;

	}
}
