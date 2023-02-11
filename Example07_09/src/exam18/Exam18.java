package exam18;

public class Exam18 {

	public static void action(Robot r) {
		if(r instanceof DanceRobot) {
			DanceRobot dance = (DanceRobot) r;
			dance.dance();
		} else if (r instanceof SingRobot) {
			SingRobot sing = (SingRobot) r;
			sing.sing();
		} else if(r instanceof DrawRobot) {
			DrawRobot draw = (DrawRobot) r;
			draw.draw();
		} else {
			return;
		}
	}
	

	public static void main(String[] args) {
		Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot()};
		for(int i=0; i< arr.length;i++)
			action(arr[i]);
	}

}
