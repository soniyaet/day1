package day3;

import java.util.Scanner;

/*Write a program to find the given string is pangram or not.
(Hint: Pangrams are words or sentences containing every letter of the alphabet at least once)
Sample Input :
The quick brown fox jumps over the lazy dog.                                                
Sample Output : 
Pangram
*/
public class PangramOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scanner=new Scanner(System.in);
    String string=scanner.nextLine();
    int count[]=new int[26];
    boolean flag=true;
    char ch;
    for (int i = 0; i < string.length(); i++) {
		ch = string.charAt(i);
		if (ch==' ') {
		    continue;
		}
if (ch>='A'&&ch <='Z') {
			
			count[ch-'A']++;
		}
else if (ch>='a'&&ch <= 'z') {
			
			count[ch-'a']++;
		}
	}
    for (int i = 0; i < count.length; i++) {
    	
		if (count[i]==0) {
			flag=false;
			break;
		}
	}
    if (flag) {
		System.out.println("pangram");
	} else {
		System.out.println("Not a Pangram");
	}
	}

}
