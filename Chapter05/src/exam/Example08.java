package exam;

public class Example08 {

	public static void main(String[] args) {
		int[][] array = {
				{85, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		int total = 0;
		int count = 0;
		
		for(int i=0; i<array.length; i++) {
			count += array[i].length;
			for(int k=0; k<array[i].length; k++) {
				total += array[i][k];
			}
		}
		
		double average = (double)total /count;
		System.out.println("총점" + total);
		System.out.println("평균" + average);
	}

}
