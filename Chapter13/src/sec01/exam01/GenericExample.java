package sec01.exam01;

public class GenericExample {

	public static void main(String[] args) {
		// k는 Tv로 M은 String으로
		Product<Tv, String> product1 = new Product<>();
		
		product1.setKind(new Tv());
		product1.setModel("스마트 Tv");
		
		Tv tv = product1.getKind();
		String tvModel = product1.getModel();
		
		// K는 Car로 M은 String으로
		Product<Car, String> product2 = new Product<>();
		
		product2.setKind(new Car());
		product2.setModel("SUV 자동차");
		
		Car car = product2.getKind();
		String carModel = product2.getModel();
	}
}