import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		 int[] list = {56, 34, 1, 8, 101, -2, -33};
	     
		 Arrays.sort(list);
		 	     
	     int number = 8;
	     
	     for (int i = 0; i < list.length ; i++) {
			if( list[i] == number) {
				System.out.println("k���k olan en b�y�k : "+ list[i-1] +" b�y�k olan en k���k : " + list[i+1]);
			}
		}
	}
}
