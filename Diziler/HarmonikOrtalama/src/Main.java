

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] numbers = {1, 2, 3, 4, 5};
		double sumHarmonik = 0;
		for (double i:numbers) {
			sumHarmonik += 1/i;
		}
		double result = numbers.length / sumHarmonik;
		System.out.println(result);
		
	}
	

}
