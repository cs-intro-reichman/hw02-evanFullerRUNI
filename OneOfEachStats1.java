/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		// Gets the two command-line arguments
		int T = Integer.parseInt(args[0]);
		// initailizes gender counts and iterator
		int g = 0;
		int b = 0;
		int i = 0;
		int count = 0; // number of children per test
		int total = 0;
		// numbers of tests resulting in corresponding values
		int two = 0;
		int three = 0;
		int fourPlus = 0;
		String mode = "2";
		// loops T number of times running each experiment until at least one of each gender born
		while (i < T){
			while (g == 0 || b == 0) {
				if (g > 0 || b > 0) {
				}
				if ((int) (Math.random() * 2) == 1) {
					b++;
				} else {
					g++;
				}
				count++;
			}
			if (count == 2) {
				two++;
			} else if (count == 3) {
				three++;
			} else {
				fourPlus++;
			}

			total += count;
			count = 0;
			g = 0;
			b = 0;
			i++;
		}
		// determines most common number of children for a test
		if (three > two && three >= fourPlus) {
            mode = "3";
        } else  if (fourPlus > two && fourPlus > three) {
            mode = "4 or more";
		}
		// prints results of data
		System.out.println("Average: " + ((double) total / T) + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + two);
		System.out.println("Number of families with 3 children: " + three);
		System.out.println("Number of families with 4 or more children: " + fourPlus);
		System.out.println("The most common number of children is " + mode);
	}
}
