package day3;

import java.util.Scanner;

/*Return the String without the first 2 characters except when
a.	Keep the first char if it is 'k'
b.	Keep the second char if it is 'b'.
Create a class UserMainCode with a static method getString which accepts a string and the return type (string) should be the modified string based on the above rules. Consider all letters in the input to be small case.

Input and Output Format:
Input consists of a string with maximum size of 100 characters.
Output consists of a string.

Sample Input 1:
hello
Sample Output 1:
llo
Sample Input 2:
kava
Sample Output 2:
kva
*/
public class StringExceptTwo {
    public static String getString(String string) {
    	char first=string.charAt(0);
    	char second=string.charAt(1);
    	if(first=='k' && second=='b') {
    		return string;
    	} else if (first=='k' && second!='b') {
    		return string.charAt(0)+string.substring(2);
    	} else if (first!='k' && second=='b') {
    		return string.substring(1);
    	} else {
    		return string.substring(2);
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		String str=scanner.next();
		System.out.println(StringExceptTwo.getString(str));
	}

}
