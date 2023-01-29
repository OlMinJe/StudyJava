
public class Exam22 {

	public static void main(String[] args) {
		String str = "123";
		System.out.println(str + "는 숫자입니까? " + isNumber(str));
		
		str = "1234o";
		System.out.println(str + "는 숫자입니까? " + isNumber(str));
	}

	public static boolean isNumber(String str) {
		/*
		boolean result = false;
		int cnt = 0;
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) >= 48 && str.charAt(i) <= 57) {
				cnt++;
			}
		}
		
		if(cnt == str.length()) {
			result = true;	
		}
		
		return result;
		*/
		if(str == null && str.equals("")) {
			return false;
		}
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch < '0' || ch >'9') {
				return false;
			}
		}
		
		return true;
	}
	
}
