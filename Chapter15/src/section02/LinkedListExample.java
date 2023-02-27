package section02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {
		// ArrayList 컬렉션 객체 생성
		List<String> list1 = new ArrayList<String>();
		
		// LinkedList 생성
		List<String> list2 = new LinkedList<String>();
		
		// 시작 시간, 끝 시간 변수
		long startTime;
		long endTime;
		
		// ArrayList 시간 측정
		startTime = System.nanoTime();
		for(int i = 0; i < 10000; i++) {
			list1.add(0, String.valueOf(i));
		}
		
		endTime = System.nanoTime();
		System.out.println("ArrayList 걸린시간: " + (endTime - startTime) + "ns");
		
		// LinkedList 시간 측정
		startTime = System.nanoTime();
		for(int i = 0; i < 10000; i++) {
			list2.add(0, String.valueOf(i));
		}
		
		endTime = System.nanoTime();
		System.out.println("LinkedList 걸린시간: " + (endTime - startTime) + "ns");

	}

}
