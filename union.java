package Programs;


public class union {
    
    public static void arrays(int[]Array1,int[]Array2,int size){
       int[]union = new int [20];
       
       int i=0;
       int j =0;
      
           for(i=0;i<Array1.length;i++){
               union[i]=Array1[i];

           }

           for(j=0;j<Array2.length;j++){
               for(i=0;i<Array1.length;i++){
                   if(Array2[j]==Array1[i])
                   {
                     break;
                   }

               }
               union[i+1] = Array2[j];
                
        }
        while(union[i]>0){
            System.out.println(union[i]);
           i++;
        }
      
    }
       

    public static void main(String[] args) {
        int [] Array1 = {1,2,3,4,5};
        int[]  Array2 = {6,3,4};
        arrays(Array1, Array2, Array1.length);
        
        
    }

   
     
    
}
