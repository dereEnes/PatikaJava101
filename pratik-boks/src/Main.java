import java.util.Random;

public class Main {
	
	public static void main(String[] args) {
		  Random rnd = new Random();
	      Fighter marc = new Fighter("Marc" , 15 , 100, 90, 0);
	      Fighter alex = new Fighter("Alex" , 10 , 95, 100, 0);
	      Ring r = new Ring(marc,alex , 90 , 100, rnd.nextInt(2));
	      r.run();
	}
}


