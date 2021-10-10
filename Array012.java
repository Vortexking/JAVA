package Programs;

public class Array012 {

    private static void array(int[]input)
    {  
        int c0=0,c1=0,c2=0;
        for(int i=0;i<input.length;i++)
        {
            switch(input[i])
            {
                case 0:
                      c0++;
                      break;
                case 1:
                      c1++;
                      break;
                case 2:
                      c2++;
                      break;

            }
        }

        int j=0;
        while(c0>0){
            input[j]=0;
            j++;
            c0--;

        }
        while(c1>0){
            input[j]=1;
            j++;
            c1--;
        }

        while(c2>0){
            input[j]=2;
            j++;
            c2--;
        }
       
    }

    private static void print(int[]input){
        for(int i=0;i<input.length;i++)
        {
          System.out.println("array"+ input[i]);
        }
    }
    public static void main(String[] args) {
        int[] input = {0,0,0,1,2,2};
        array(input);
        print(input);
    }    
    

    
}
