package Programs;

public class Negativeno {

    private static void partition(int[]array)
    {
        int j=0; int temp;
       
        for(int i=0;i<array.length;i++)
        {
            if(array[i]<0){
                if(i!=j){
                 temp=array[i];
                 array[i]=array[j];
                 array[j]=temp;
               
                }
                j++;
            }
             
        
            
        }
    }

   

    private static void print(int[]array){
        System.out.print("\nPartitioned array\n");
        for(int i=0;i<array.length;i++){
           
            System.out.print("\t"+array[i]);
        }
    }



    public static void main(String[] args) {
        int[]array={-2,2,34,-12,11};
        partition(array);
        print(array);
    }
    
}
