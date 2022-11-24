package de.hfu;

import java.util.Scanner;

/**Main class
 * 
 * @author Florim
 * @version 1.0
 *
 */
public class App 
{
	/**Main method, takes user input and prints the input in upper case
	 * 
	 * 
	 * @param args
	 */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your text: ");
        String input = scan.nextLine();
        System.out.println(input.toUpperCase());
    }
}

