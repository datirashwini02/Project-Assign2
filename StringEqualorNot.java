//Q 2 wap to ask two string values from user and check if they are equal or not 
package stringwork1;

import java.util.Scanner;

public class StringEqualorNot {

	public static void main(String[] args) {
		
		Scanner e =new Scanner(System.in);
		System.out.println("Check the strings are equal: ");
		String string1 = e.nextLine();
		System.out.println("Enter First String: "+string1);
		
		String string2 = e.nextLine();
		System.out.println("Enter Second String: "+string2);
		
		
		
		if(string1.equals(string2)== true) {
			System.out.println("YES!!strings are equal");
		}
		else {
			System.out.println("NO!!strings are not equal");
	}

	}
}
