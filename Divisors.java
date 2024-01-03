/**
 *  Gets a command-line argument (int), and prints all the divisors of the given number.
 */
public class Divisors {
	public static void main (String[] args) {
		// takes int from command line and initializes divisor
		int x = Integer.parseInt(args[0]);
		int d = 0;
		// loop tests for divisors and prints if valid
		while (d < x) {
			if (x % ++d == 0) {
				System.out.println(d);
			}
		}
	}
}
