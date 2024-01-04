/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {

		// initialize a random int and an int less than zero
		int n = (int) (Math.random() * 10);
		int m = -1;
		// prints n while larger than m, sets m to n, then sets n to new random int
		while (n >= m) {
			System.out.print(n);
			m = n;
			n = (int) (Math.random() * 10);
			if (n >= m) { // tests whether space is needed to delimit output value from next output value
				System.out.print(' ');
			}
		}

		System.out.println();
	}
}
