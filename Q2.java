package Programs;

public class Q2 {
    static class Pair{
        int min;
        int max;
    }
   
    static Pair Getminmax(int arr[],int size)
    {
        Pair minmax = new Pair();
        int i;
        
        if(size==1){
            minmax.max = arr[0];
            minmax.min = arr[0];
        }

        if(arr[0]>arr[1]){
            minmax.max=arr[0];
            minmax.min=arr[1];
        }
        else
         minmax.max=arr[1];
         minmax.min=arr[0];

         for( i=2;i<size;i++)
         {
            if(arr[i]>minmax.max)
            {
                minmax.max=arr[i];
            }
            else if (arr[i]<minmax.min){
                minmax.min=arr[i];
            }
         }

         return minmax;

    }
    public static void main(String[] args) 
    {
        int arr[]={2,4,5,6,7};
           int  size = 5;
           Pair minmax = Getminmax(arr, size);
           System.out.printf("\nMinimum value in array %d",minmax.min);
           System.out.printf("\nMaximum value in array %d",minmax.max);

        
    }

   
}

 