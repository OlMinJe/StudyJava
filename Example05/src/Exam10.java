
public class Exam10 {

	public static void main(String[] args) {
		// 다음은 알파벳과 숫자를 아래에 주어진 암호표로 암호화하는 프로그램이다
		char[] abcCode = 
			{',', '~', '!', '@', '#', '$', '%', '^', '&', '*',
			'(', ')', '-', '_', '+', '=', '|', '[', ']', '{', '}',
			';', ':', ',', '.', '/'
			};
		
		char[] numCode = {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'};
		
		String src ="abc123";
		String result = "";
		
		// 문자열 src의 문자를 charAt()으로 하나씩 읽어서 변환 후 result에 저장
		for(int i=0; i<src.length(); i++) {
			char ch =src.charAt(i);
			
			int index;
			if(ch >= '0' && ch <= '9') {
				/*
				for(int j =0; j<numCode.length; j++) {
					if(j == (ch-48)) {
						result += numCode[j];
					}
				}
				/**/
				index = ch -'0';
				result += numCode[index];
			} else if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
				/*
				for(int j =0; j<abcCode.length; j++) {
					if((j == ch-97) || (j == ch-65)) {
						result += abcCode[j];
					}
				}
				/**/
				index = ch -'a';
				result += abcCode[index];
			}
		}
		
		System.out.println("src: " + src);
		System.out.println("result: " + result);
	}

}
