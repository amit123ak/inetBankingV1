// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class Main {
    public static void main(String[] args) {
       
       int leader=0;
       List<Integer> list=new ArrayList<>();
     int  arr[] ={1, 2, 3, 4, 5, 2};

     //{16, 17, 4, 3, 5, 2};
    for(int i=0;i<arr.length-1;i++)
    {
         leader= arr[i];
        for(int j=i+1;j<arr.length;j++)
        {
            if(leader<arr[j])
            {
                leader=arr[j];
            }
        }
        if(!list.contains(leader))
        {
        list.add(leader);
        }
    }
    list.add(arr[arr.length-1]);
    System.out.println(list);

    }
}
