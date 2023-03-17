package section01;

// 인터페이스가 함수형 인터페이스임을 보장하기 위해서 어노테이션을 추가해준다(선택사항)
@FunctionalInterface
public interface Calculable {
	void calculate(int x, int y);
}
