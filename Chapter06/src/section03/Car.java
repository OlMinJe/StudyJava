package section03;

public class Car {
	int gas;
	
	// 리턴값이 없음
	void setGas(int gas) {
		this.gas = gas;
	}
	
	// 리턴값이 boolean형인 메서드로 리턴
	boolean isLeftGas() {
		if(gas == 0) {
			System.out.println("gas가 없습니다.");
			return false;
		}
		System.out.println("gas가 없습니다.");
		return true;
	}
	
	void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("달립니다. (gas 잔량: " + gas + ")");
				gas--;
			} else {
				System.out.println("몀춥니다. (gas 잔량: " + gas + ")");
				return;
			}
		}
	}

}
