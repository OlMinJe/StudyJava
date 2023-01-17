
public class Exam02 {
	public static void main(String[] args) {
		int numOfApples = 123; // 사과의 개수
		int sizeOfBucket = 10; // 바구니 크기
		//int numOfBucket = (numOfApples % 10 == 0) ? (numOfBucket = numOfApples/10) : (numOfBucket = numOfApples/10 + 1);
		int numOfBucket = numOfApples/sizeOfBucket + (numOfApples%sizeOfBucket == 0 ? 0 : 1);
		
		System.out.println("필요한 바구니의 수: " + numOfBucket);
	}
}
