package section05;

import java.net.URL;

public class getResourceExample {

	public static void main(String[] args) {
		Class clazz = Car.class;
		
		// 상대 경로로 처리할 때 사용하면 좋다.
		// String path = clazz.getResource("DateExample.class").getPath();
		URL url = clazz.getResource("DateExample.class");
		
		System.out.println(url);
	}

}
