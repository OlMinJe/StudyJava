package section08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ImmutableExample {

	public static void main(String[] args) {
		// <불변 컬렉션 생성>
		List<String> immutableList1 = List.of("A", "B", "C");
		//immutableList1.add("D"); 
		// java.lang.UnsupportedOperationException (of메소드로 만든 리스트는 추가, 삭제, 변경이 안 된다는 의미)
		
		Set<String> immutableSet1 = Set.of("A", "B", "C");
		// immutableSet1.remove("A");
		// java.lang.UnsupportedOperationException 
		
		Map<Integer, String> immutableMap1 = Map.of(
			1, "A",
			2, "B",
			3, "C"
		);
		// immutableMap1.put(4, "D");
		// java.lang.UnsupportedOperationException
		
		// <컬렉션을 불변 컬렉션으로 복사>
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		List<String> immutableList2 = List.copyOf(list);
		
		Set<String> set = new HashSet<>();
		set.add("A");
		set.add("B");
		set.add("C");
		Set<String> immutableSet2 = Set.copyOf(set);
		
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		Map<Integer, String> immutableMap2 = Map.copyOf(map);
		
		String[] arr = {"A", "B", "C"};
		List<String> immutableList3 = Arrays.asList(arr);
	}

}
