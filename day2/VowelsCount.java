package day2;

import java.util.Scanner;

public class VowelsCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    @SuppressWarnings("resource")
	Scanner scanner= new Scanner(System.in);
   String string= scanner.next();
   int count=0;
   char[] vowels=new char[] {'a','e','i','o','u','A','E','I','O','U'};
   for(int i=0;i<string.length();i++)
   {
	   char character=string.charAt(i);
	   for(int j=0;j<vowels.length;j++)
	   {
		 if(character==vowels[j])
		 {
			 count++;
			 break;
		 }
	   }
   }
   System.out.println("Vowels Count : "+count);
}

}
