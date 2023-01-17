package ch02.sec07;

public class CastingExample {

	public static void main(String[] args) {
		// [1]
		int var1 = 10;
		byte var2 = (byte)var1; 
		System.out.println(var2);
		
		// [2]
		long var3 = 300;
		int var4 = (int)var3;
		System.out.println(var4);
		
		// [3]
		int var5 = 65;
		char var6 = (char)var5; // short로 변환하면 안 된다. 똑같은 2byte아닌가..?
		System.out.println(var6);
		
		// [4]
		double var7 = 3.14;
		float var8 = (float)var7;
		System.out.println(var8);
	}

}
