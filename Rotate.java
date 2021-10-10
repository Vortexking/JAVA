package Programs;
public class Rotate {
    public static void main(String[] args) {
        int[]arr = {2,3,4,5,6,7};
        int n = arr.length;
        rotate(arr,n);
    }

    private static void rotate(int[]arr,int n){
        
            int[]rotated = new int [6];
            int k=1;
            int i =0;
            rotated[0]=arr[arr.length-1];
            for( i=0;i<n-1;i++){
                rotated[k]=arr[i];
                k++;

            }
            for(i=0;i<n;i++){
                System.out.println("Printed Array\n"+"\t"+rotated[i]);
            }
    }
    
}
