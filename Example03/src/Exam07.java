public class Exam07 {

	public static void main(String[] args) {
		int fahrenheit = 100;
		/*
		double celcius = (fahrenheit - 32) * 5/9.0;
		
		System.out.printf("Fahrenheit: %d\n", fahrenheit);
		System.out.printf("Celcius: %.3f", celcius);
		/**/
		
		float celcius = (int) ((5/9f * (fahrenheit - 32)) * 100 + 0.5) / 100f; 
		System.out.printf("Fahrenheit: %d\n", fahrenheit);
		System.out.println("Celcius: " + celcius);
	}

}
