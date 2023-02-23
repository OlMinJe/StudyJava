import java.util.StringTokenizer;

class Exam03 {

	public static void main(String[] args) {
		String fullPath = "c:\\jdk1.8\\work\\PathSeparateTest.java";
		String path = "";
		String fileName = "";
		
		/*
		(1) 알맞은 코드를 넣어 완성하시오.
		*/
		/*
		StringTokenizer st = new StringTokenizer(fullPath, "\\");
		for(int i = 0; i < 3; i++) {
			path += st.nextToken();
			if(i == 2) break;
			path += "\\\\";
		}
		fileName = st.nextToken();
		/**/
		int pos = fullPath.lastIndexOf("\\");
		if(pos != -1) {
			path = fullPath.substring(0, pos);
			fileName = fullPath.substring(pos + 1);
		}
		
		System.out.println("fullPath: " + fullPath);
		System.out.println("path: " + path);
		System.out.println("fileName: " + fileName);
	}

}
