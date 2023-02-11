package section08;

public class Home {
	private RemoteControll rc= new RemoteControll() {
		@Override
		public void turnOn() {
			System.out.println("TV를 켭니다.");			
		}
		
		@Override
		public void turnOff() {
			System.out.println("TV를 끕니다.");
		}
	};
	
	public void use1() {
		rc.turnOn();
		rc.turnOff();
	}
	
	public void use2() {
		RemoteControll rc = new RemoteControll() {
			
			@Override
			public void turnOn() {
				System.out.println("에어컨을 켭니다.");				
			}
			
			@Override
			public void turnOff() {
				System.out.println("에어컨을 끕니다.");
			}
		};
		rc.turnOn();
		rc.turnOff();
	}
}
