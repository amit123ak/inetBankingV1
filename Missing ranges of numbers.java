// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class Main {
    public static void main(String[] args) {
    int[] arr = {14, 15, 20, 30, 31, 45};
    int lower =10;
    int upper=50;
    //out [[10, 13], [16, 19], [21, 29], [32, 44], [46, 50]]
    
    List<List<Integer>> list=new ArrayList<>();
    if(lower<arr[0])
    {
        
        list.add(Arrays.asList(lower,arr[0]-1));
    }
    
    for(int i=0;i<arr.length-1;i++)
    {
        
        if(arr[i+1]-arr[i]>1)
        {
            list.add(Arrays.asList(arr[i]+1,arr[i+1]-1));
            
        }
    }
    if(upper>arr[arr.length-1])
    {
        list.add(Arrays.asList(arr[arr.length-1]+1,upper));
    }
  System.out.println(list);
    }
}
