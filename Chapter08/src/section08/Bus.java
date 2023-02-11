package section08;

public class Bus implements Vehicle {
	@Override
	public void run() {
		System.out.println("버스 부르릉");
	}
	
	public void checkFace() {
		System.out.println("승차요금 쳌");
	}
}
