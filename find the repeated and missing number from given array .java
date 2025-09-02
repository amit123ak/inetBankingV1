// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class Main {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        int arr[]={3,1,3};
        int n=arr.length;
        int freq[]=new int[n+1];
        
    // find the missing and repeated one 
    int missing =0;
    int repeated=0;
    for(int i=0;i<n;i++ )
    {
        freq[arr[i]]++;
    }
    
    for(int i=1;i<=n;i++)
    {
        
        if(freq[i]==0)
        {
            missing =i;
        }else if(freq[i]==2)
        {
            repeated =i;
        }
    }
    list.add(repeated);
   list.add(missing);
   System.out.println(list);

    
    
    }
}
