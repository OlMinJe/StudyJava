package example;

public class LoginExample {

	public static void main(String[] args) {
		try {
			login("white", "12345");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			login("blue", "54321");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void login(String id, String password) throws NotExistIDException {
		// id가 blue가 아니라면 NotExistIDException을 발생시킴
		if(!id.equals("blue")) {
			throw new NotExistIDException("아이디가 올바르지 않습니다.");
		}
		
		if(!password.equals("12345")) {
			throw new NotExistIDException("비밀번호가 올바르지 않습니다.");
		}
	}

}
