package section05;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		// TreeSet 컬렉션 생성
		TreeSet<Integer> scores = new TreeSet<>();
		
		// Integer 객체 저장
		scores.add(87);
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(80);
		
		for(Integer s : scores) {
			System.out.print(s + " ");
		} // set은 순서대로 출력할 수 없는데 출력해보니 순서대로 출력됨 -> 가능한 이유: 이진트리
		// 애초에 TreeSet자체가 이진트리를 기반으로 한 set 컬렉션이기 때문에 이진트리가 사용된다.
		System.out.println("\n");
		
		System.out.println("가장 낮은 점수: " + scores.first());
		System.out.println("가장 높은 점수: " + scores.last());
		System.out.println("95점 아래 점수: " + scores.lower(95));
		System.out.println("95점 위의 점수: " + scores.higher(95));
		System.out.println("95점이거나 바로 아래 점수: " + scores.floor(95));
		System.out.println("85점이거나 바로 위의 점수: " + scores.ceiling(85) + "\n");
		
		// 내림차순으로 정렬하기
		NavigableSet<Integer> descendingScores = scores.descendingSet(); 
		// descendingSet으로 정렬한 뒤 NavigableSet 타입으로 복제하여 사용한다.(원본 변경X)
		for(Integer s : descendingScores) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		for(Integer s : scores) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		NavigableSet<Integer> rangeSet = scores.tailSet(80, true);
		for(Integer s : rangeSet) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		rangeSet = scores.subSet(80, true, 90, false);
		for(Integer s : rangeSet) {
			System.out.print(s + " ");
		}
		System.out.println();
			
	}
}
