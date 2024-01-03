/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		// takes int from command, initializes sum, constructs start of string for affirmative result
		int n = Integer.parseInt(args[0]);
		int sum = 1;
		String p = n + " is a perfect number since " + n + " = 1";
		// loops for divisors, adding them to sum if valid
		for (int d = 2; d < n; ++d) {
			if (n % d == 0 ) {
				p += " + " + d;
				sum += d;
			}
		}
		// prints affirmative message if n is perfect, else negative message
		if (sum == n && n > 1) {
			System.out.println(p);
		} else {
			System.out.println(n + " is not a perfect number");
		}
	}
}
