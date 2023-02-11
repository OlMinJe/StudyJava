package section07;

public class ButtonExample {
	public static void main(String[] args) {
		// OK 버튼 객체 생성
		Button btnOk = new Button();
		
		// OK 버튼 클랙 이벤트 처리할 구현 클래스(로컬 클래스)
		class OkListener implements Button.ClickListener {
			@Override
			public void onClick() {
				System.out.println("OK 버튼을 클릭했습니다.");
			}
		}
		
		// OK 버튼 객체에 ClickListener 구현 객체 주입
		btnOk.setClickListener(new OkListener());
		
		// Ok 버튼 클릭하기
		btnOk.click();
		
		// cancel 버튼
		Button btnCancel = new Button();
		
		// 이벤트 처리 구현 클래스
		class CancelListener implements Button.ClickListener {
			@Override
			public void onClick() {
				System.out.println("Cancel 버튼을 클릭했습니다.");
			}
		}
	}
}
