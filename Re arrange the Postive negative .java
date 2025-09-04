// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr= new ArrayList<>(Arrays.asList(-5, -2, 5, 2, 4, 7, 1, 8, 0, -8));
        
      
        ArrayList<Integer> pos=new ArrayList<>();
        ArrayList<Integer> neg=new ArrayList<>();
        
        
    for(int i=0;i<arr.size();i++)
    {
        if(arr.get(i)>=0)
        {
            pos.add(arr.get(i));
        }else{
            
            neg.add(arr.get(i));
        }
        
    }
    int ngid =0;
    int psid=0;
    int i=0;
    while(psid<pos.size()&& ngid<neg.size())
    {
        
     
       if(i%2==0)
       {
           arr.set(i++,pos.get(psid++));
       }else{
           arr.set(i++,neg.get(ngid++));
       }
      
        
    }
    
    while(psid<pos.size())
    {
    arr.set(i++,pos.get(psid++));
  

    }
     while(ngid<neg.size())
    {
    arr.set(i++,neg.get(ngid++));
  
    }
    
    
    
        System.out.println(arr);
        
        
    }
        
}
