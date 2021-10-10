package Programs;
import java.util.Random;
import java.util.Scanner;

public class MergeSorting {
    private static void mergeSort(int[]inputArray)
    {
       int inputlength = inputArray.length;
       if(inputlength<2){
           return;
       }

       int midIndex = inputlength/2;
       int[]LeftHalf = new int[midIndex];
       int[]RightHalf= new int[inputlength - midIndex];

       for(int i=0;i<midIndex;i++)
       {  LeftHalf[i]=inputArray[i];
        }
        for(int i=midIndex;i<inputlength;i++)
        {  RightHalf[i-midIndex]=inputArray[i];

        }
        mergeSort(LeftHalf);
        mergeSort(RightHalf);
        
        merge(inputArray,LeftHalf,RightHalf);
    
    }

    private static void merge(int[]inputArray,int[]LeftHalf,int[]RightHalf)
    {   int i=0,j=0,k=0;
        int leftsize = LeftHalf.length;
        int rightsize = RightHalf.length;
        while(i<leftsize && j<rightsize)
        {
          if(LeftHalf[i]<=RightHalf[j]){
           inputArray[k]=LeftHalf[i]; 
           i++;
          }
          else{
              inputArray[k]=RightHalf[j];
              j++;
          }
          k++;
        }
        while(i<leftsize){
            inputArray[k]=LeftHalf[i];
            i++;
            k++;

        }
        while(j<rightsize){
            inputArray[k]=RightHalf[j];
            j++;
            k++;
        }
   
    }
     private static void printArray(int[]number){
          for(int i=0;i<number.length;i++){
              System.out.println(number[i]);
          }
     }


    public static void main(String[] args) {
        Random rand = new Random();
        int[]number = new int[10];
        Scanner scan = new Scanner(System.in);
          int a = scan.nextInt();
        
        for(int i =0;i<number.length;i++){
            number[i]=rand.nextInt(1000000);
        }

        System.out.println("Before");
        printArray(number);
        mergeSort(number);

        System.out.println("\nAfter");
        printArray(number);
        System.out.println(a  +  "Smallest number is" + number[a]);

        
    }
    
}
