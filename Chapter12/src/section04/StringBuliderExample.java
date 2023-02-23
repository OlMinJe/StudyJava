package section04;

public class StringBuliderExample {

	public static void main(String[] args) {
		/*
		 * StringBuilder sb = new StringBuilder();
		sb = sb.append("DEF").insert(0, "ABC").delete(3, 4);
		String data = new String(sb);
		*/

		String data = new StringBuilder().append("DEF").insert(0, "ABC").delete(3, 4).toString();		
		System.out.println(data);
	}

}
