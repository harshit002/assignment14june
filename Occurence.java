package stringHandling;

import java.util.Scanner;

public class Occurence {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		String searchString=sc.nextLine();
		String word=" ";
		for(int i=0;i<=(str1.length()-1);i++)
		{
			char d=str1.charAt(i);
			if(d!=' ')
			{
				word = word+d;
				if(word.equals(searchString)==true)
					System.out.println("substring present= "+word);
			}
		}
		
	}

}
