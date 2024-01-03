
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		// initialize counts for girls and boys born
		int g = 0;
		int b = 0;
		// loops while either value is still 0 and prints result of birth
		while (g == 0 || b == 0) {
			if (g > 0 || b > 0) {
				System.out.print(' ');
			}
			if ((int) (Math.random() * 2) == 1) {
				System.out.print('b');
				b++;
			} else {
				System.out.print('g');
				g++;
			}
		}
		// prints total children
		System.out.println("\nYou made it... and you now have " + (g + b) + " children.");
	}
}
