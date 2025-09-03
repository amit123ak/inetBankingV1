// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class Main {
    public static void main(String[] args) {
       
       List<Integer> result=new ArrayList<>();
     int  arr[] ={1, 2, 3, 4, 5, 2};
     // approch two
     int j;
     for(int i=0;i<arr.length;i++)
    {
        
     for( j=i+1;j<arr.length;j++)
     {
         
         if(arr[i]<arr[j])
          {
              break;
          }
     }
     if(j==arr.length)
     {
        result.add(arr[i]); 
     }
    }

   System.out.println(result);
    
    }
}
