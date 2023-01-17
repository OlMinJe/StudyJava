package ch02.sec02;

public class StringExam {

	public static void main(String[] args) {
		// [1]
		String name = "홍길동";
		String job = "프로그래머";
		
		System.out.println(name);
		System.out.println(job);
		
		// [2]
		String str1 = "나는 \"자바\"를 배웁니다.";
		System.out.println(str1);
		
		// [3]
		String str2 = "나의 학점은 'A'입니다.";
		System.out.println(str2);
		
		// [4]
		String str3 = "번호\t이름\t작업";
		System.out.println(str3);
		
		// [5]
		String str4 = "나는\n자바를\n배웁니다.";
		System.out.println(str4);
		
		// [6]
		String str5 = "작업 경로: C:\\program\\java\\test.java";
		System.out.println(str5);
		
	}

}
