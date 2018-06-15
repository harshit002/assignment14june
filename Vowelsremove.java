package stringHandling;

import java.util.Scanner;

public class Vowelsremove {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		str=str.toLowerCase();
		for(int i=0;i<str.length();i++)
		{
			char d=str.charAt(i);
			if(d=='a'||d=='e'||d=='i'||d=='o'||d=='u')
			{
				str=str.replace(d, ' ');
			}
		}
		
             System.out.println(str);
	}

}
