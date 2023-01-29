
public class Exam20 {
	public static void main(String[] args) {
		int[] original = {1,2,3,4,5,6,7,8,9};
		System.out.println(java.util.Arrays.toString(original)); // static 메서드라서 바로 사용
		int[] result = shuffle(original);
		System.out.println(java.util.Arrays.toString(result));
	}

	public static int[] shuffle(int[] original) {
		if(original == null || original.length == 0) {
			return original;
		}
		
		for(int i = 0; i < original.length; i++) {
			int num = (int)(Math.random() * (original.length +1));
			int temp = original[i];
			original[i] = original[num];
			original[num] = temp;
		}
		
		return original;
	}

}
