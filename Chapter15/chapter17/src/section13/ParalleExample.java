package section13;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Stream;

public class ParalleExample {

	public static void main(String[] args) {
		Random random = new Random();
		
		List<Integer> scores = new ArrayList<>();
		for(int i = 0; i < 100000000; i++) {
			scores.add(random.nextInt(101));
		}
		
		double avg = 0.0;
		long startTime = 0;
		long endTime = 0;
		long time = 0;
		
		Stream<Integer> stream = scores.stream();
		startTime = System.nanoTime();
		
		avg = scores.stream()
				.mapToInt(Integer::intValue)
				.average()
				.getAsDouble();
		endTime = System.nanoTime();
		time = endTime - startTime;
		System.out.println("avg: " + avg + ", 일반 스트림 처리 시간: " + time + "ns");
		
		Stream<Integer> parallelStream = scores.parallelStream(); // 병렬 스트림 얻음
		startTime = System.nanoTime();
		avg = parallelStream.mapToInt(Integer::intValue)
				.average()
				.getAsDouble();
		endTime = System.nanoTime();
		time = endTime - startTime;
		// 이번에는 병렬 스트림에서의 시간을 호강니해봄
		System.out.println("avg: " + avg + ", 병렬 스트림 처리 시간: " + time + "ns");
		
	}

}
