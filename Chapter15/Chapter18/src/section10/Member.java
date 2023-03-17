package section10;

import java.io.Serializable;

public class Member implements Serializable{
	
	/* Serializable 인터페이스를 구현하면 추상 메서드가 없으므로 메서드를 구현할 필요가 없다.
	 * 단, 직렬화를 위해 serialVersionUID를 추가해야 함
	 * 마우스를 클래스명 가까이 가져가서 Add Generated Serial Version ID 선택
	 */
	private static final long serialVersionUID = -622284561026719240L;
	private String id;
	private String name;
	
	public Member(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return id + ": " + name;
	}
	
}
