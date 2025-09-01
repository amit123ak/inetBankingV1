// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class Main {
    public static void main(String[] args) {
// Move All Zeroes To End
      int  arr[] = {1, 2, 0, 4, 3, 0, 5, 0};
//Output: [1, 2, 4, 3, 5, 0, 0, 0]
int temp[]=new int[arr.length];
int j=0;
int count=0;
for(int i=0;i<arr.length;i++)
{
    
    if(arr[i]!=0)
    {
        temp[j]=arr[i];
        j++;
    }else{
        count++;
    }
}
for(int k=0;k<count;k++)
{
    temp[j]=0;
    j++;
}
for(int p=0;p<temp.length;p++)
{
    System.out.print(temp[p]+ " ");
} 
 
    }
}
