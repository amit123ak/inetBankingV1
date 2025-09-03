// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class Main {
    public static void main(String[] args) {
       
       List<Integer> result=new ArrayList<>();
     int  arr[] ={1, 2, 3, 4, 5, 2};
     // approch  third 
     
     int max = arr[arr.length-1];
     result.add(max);
     
     for(int i=arr.length-2;i>=0;i--)
     {
         
         if(arr[i]>max)
         {
             max=arr[i];
             result.add(max);
         }
     }
     Collections.reverse(result);
     
     System.out.println(result);
     
    
    }
}
