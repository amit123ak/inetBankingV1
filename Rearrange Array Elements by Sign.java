// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class Main {
    public static void main(String[] args) {
        
        int arr[] = {1, 2, 3, -4, -1, 4};
        //-5, -2, 5, 2, 4, 7, 1, 8, 0, -8
          ArrayList<Integer> list = new ArrayList<>(Arrays.asList(-5, -2, 5, 2, 4, 7, 1, 8, 0, -8));

        
        //Output: arr[] = [1, -4, 2, -1, 3, 4]
        int n =list.size();
        
        
        for(int i=0;i<list.size();i++)
        {
            
            if(list.get(i)>=0&& i%2==1)
            {
                
                for(int j=i+1;j<list.size();j++)
                {
                    if(list.get(j)<0)
                    {
                        rotate(list,i,j);
                        break;
                    }
                }
            }else if(list.get(i)<0&& i%2==0)
            {
                for(int j=i+1;j<list.size();j++)
                {
                    if(list.get(j)>=0)
                    {
                       rotate(list,i,j);
                        break;
                    }
                }
                
            }
            
        }
        
    System.out.println(list);    
    }
    
    public static void rotate( ArrayList<Integer>list,int start,int end)
    {
        int temp=list.get(end);
        for(int i=end;i>start;i-- )
        {
            list.set(i,list.get(i-1));
        }
        list.set(start,temp);
        
    }
}
