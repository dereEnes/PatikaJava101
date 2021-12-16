import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		 int[] list = {56, 34, 1, 8, 101, -2, -33};
	     
		 Arrays.sort(list);
		 	     
	     int number = 8;
	     
	     for (int i = 0; i < list.length ; i++) {
			if( list[i] == number) {
				System.out.println("küçük olan en büyük : "+ list[i-1] +" büyük olan en küçük : " + list[i+1]);
			}
		}
	}
}
