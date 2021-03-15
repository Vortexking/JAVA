package Programs;

import java.util.Scanner;


public class Main
{   
    public  int fibo(int a)
    {   int c;
        int i;
        int var1=0;
        int var2=1;
      for(i=2;i<a;i++)
      {
       c = var1+var2;
       var1=var2;
       var2=c;
      }
      
      return var2;
      
    }
    
    public static void main(String[]args)
    { 
      System.out.println("ENTER THE NUMBER");
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
     
      Main rf = new Main(); 
      int output = rf.fibo(a);
      System.out.println(output);
      sc.close();
    
    }

}