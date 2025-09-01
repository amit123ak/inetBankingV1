// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class Main {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        //Output: [2, 1, 4, 3, 5]
        Arrays.sort(arr);
        
        for(int i=0;i<arr.length;i+=2)
        {
            
            if(i<arr.length-1 && arr[i+1]>arr[i])
            {
               int temp=arr[i+1];
                arr[i+1]=arr[i];
                arr[i]=temp;
            }
         
        }
        
        for(int j=0;j<arr.length;j++)
        {
           System.out.print(arr[j] +" "); 
        }
 
    }
}
