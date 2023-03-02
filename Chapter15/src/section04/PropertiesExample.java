package section04;

import java.util.Properties;

public class PropertiesExample {

	public static void main(String[] args) throws Exception {
		Properties properties = new Properties();
		
		// 로드 메소드 - 이 파일이 위치하는 같은 경로의 "~~"을 불러와라 
		properties.load(PropertiesExample.class.getResourceAsStream("database.properties"));
		
		// 값 읽기
		String driver = properties.getProperty("driver");
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		String admin = properties.getProperty("admin");
		
		// 값 출력
		System.out.println("driver : " + driver);
		System.out.println("url : " + url);
		System.out.println("username : " + username);
		System.out.println("password : " + password);
		System.out.println("admin : " + admin);
	}

}
