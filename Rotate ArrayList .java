// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// rotate the element in Arralist;
import java.util.*;
class Main {
    public static void main(String[] args) {
        
ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

  
   
   int k=1;
   for(int t=0;t<k;t++)
   {
        int last = list.get(list.size()-1);
       
       for(int i = list.size()-1;i>0;i--)
       {
           
           list.set(i,list.get(i-1));
       }
       list.set(0,last);
   }
 
 System.out.print(list);

    }
}
