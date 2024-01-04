/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		// takes int and initializes iterators
		int n = Integer.parseInt(args[0]);
		int i = 0;
		int j = 0;
		boolean opposite = true; // used to change pattern each new row
		// loops through rows and columns to print checkerboard pattern
		while (i++ < n) {
			while (j++ < n) {
				if (opposite) {
					System.out.print("* ");
				} else {
					System.out.print(" *");
				}
			}
			System.out.println();
			j = 0;
			opposite = !opposite; // changes pattern
		}
	}
}
