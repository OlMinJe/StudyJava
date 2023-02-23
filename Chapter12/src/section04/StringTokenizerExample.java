package section04;

import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {
		String data2 = "홍길동/이수근/박연수";
		StringTokenizer st = new StringTokenizer(data2, "/");
		
		while(st.hasMoreElements()) {
			String token = st.nextToken();
			System.out.println(token);
		}
		
		while(st.hasMoreElements()) {
			String token = st.nextToken();
			System.out.println(token);
		}
	}

}
