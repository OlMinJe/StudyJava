class MyTv2 {
	private boolean isPowerOn;
	private int channel;
	private int volume;
	private int prevChannel;

	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	public boolean isPowerOn() {
		return isPowerOn;
	}
	
	public void setPowerOn(boolean isPowerOn) {
		this.isPowerOn = isPowerOn;
	}
	
	public int getChannel() {
		return channel;
	}
	
	public void setChannel(int channel) {
		if(channel < MIN_CHANNEL || channel > MAX_CHANNEL)
			return;
		
		this.prevChannel = this.channel;
		this.channel = channel;
	}
	
	public int getVolume() {
		return volume;
	}
	
	public void setVolume(int volume) {
		if(volume < MIN_VOLUME || volume > MAX_VOLUME)
				return;
		
		this.volume = volume;
	}

	public void gotoPrevChannel() {
		/*
		int temp = this.channel;
		this.channel = this.prevChannel;
		this.prevChannel = temp;
		*/
		this.setChannel(this.prevChannel);
	}
}