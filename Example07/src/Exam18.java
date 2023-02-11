class Exam18 {
	public static void main(String[] args) {
		Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot()};

		for(int i=0; i< arr.length;i++)
			action(arr[i]);
	} // main
	
	public static void action(Robot r) {
		if(r instanceof DanceRobot) {
			DanceRobot dr = (DanceRobot)r;
			dr.dance();
		} else if(r instanceof SingRobot) {
			SingRobot sr = (SingRobot)r;
			sr.sing();
		} else if(r instanceof DrawRobot) {
			DrawRobot dr = (DrawRobot)r;
			dr.draw();
		}
	}
}