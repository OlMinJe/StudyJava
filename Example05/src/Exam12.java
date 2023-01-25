import java.util.Scanner;

public class Exam12 {

	public static void main(String[] args) {
		//단어의 글자 위치를 섞어서 보여주고 원래의 단어를 맟추는 예제이다.
		
		String[] words = {"telelvision", "computer", "mouse", "phone"};
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i<words.length; i++) {
			char[] question = words[i].toCharArray(); // String을 char[]로 변환
			
			// char 배열 question에 담긴 문자의 위치를 임의로 바꾼다.
			for(int j=0; j<question.length; j++) {
				int randomQue = (int) (Math.random() * (question.length - 1)) + 1;
				
				char tep = question[i];
				question[i] = question[randomQue];
				question[randomQue] = tep;
			}
			
			
			System.out.printf("Q%d. %s의 정답을 입력하세요.> ", i+1, new String(question));
			String answer = sc.nextLine(); // 문자열 객체를 생성하고 주소 값을 저장.
			
			// trim()으로 answer의 좌우 공백을 제거한 후, equals로 word[i]와 비교
			if(words[i].equals(answer.trim()))
				System.out.println("맞았습니다.\n\n");
			else
				System.out.println("틀렸습니다.\n\n");
		}

	}

}
