
public class Exam23 {

	public static void main(String[] args) {
		int[] data = {3,2,9,4,7};
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("최대값: " + max(data));
		System.out.println("최대값: " + max(null));
		System.out.println("최대값: " + max(new int[] {}));
	}
	
	public static int max(int[] arr) {
		/*
		int result = 0;
		
		if(arr != null && arr.length != 0) {
			result = arr[0];
			for(int i=0; i<arr.length; i++) {
				if(result < arr[i]) {
					result = arr[i];
				}
			}
		} else {
			result = -999999;
		}
		return result;
		*/
		if(arr == null || arr.length == 0) {
			return -999999;
		}
		
		int max = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		
		return max;
	}

}
