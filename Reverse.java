/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		// take input for string and determines middle char
		String s = args[0];
		int i = s.length() - 1;
		char mc = s.charAt(i / 2);
		// loops through string from last position, prints each char, then prints middle char
		while (i >= 0) {
			System.out.print(s.charAt(i));
			i--;
		}
		// prints middle character of string
		System.out.println("\nThe middle character is " + mc);
	}
}
