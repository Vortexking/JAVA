package Programs;

import java.util.*;
public class Vowels
{
    public static void vowel () {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string: ");
        String s1 = sc.nextLine();
        int i;
        int l=s1.length();
        char ch;
        int A=0;
		int E=0;
		int I=0;
		int O=0;
		int U=0;
      sc.close();
        String s=s1.toLowerCase();
        for(i=0;i<l;i++)
        {
            ch = s.charAt(i);
            if(ch=='a')
			A++;
			else if (ch=='e')
			E++;
			else if (ch=='i')
			I++;
			else if (ch=='o')
			O++;
			else if (ch=='u')
            U++;
        }
        System.out.println("total no of vowels are: \n {A E I O U} \n " +A +E +I +O +U );
        
    }
    public static void main (String[] args) {
    vowel();
    
    
    }
    
}