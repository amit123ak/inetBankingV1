// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class Main {
    public static void main(String[] args) {
  //Maximum consecutive one’s (or zeros) in a binary array
  
int arr[] = {0, 0, 0, 0};
//{0, 0, 1, 0, 1, 0};
//{0, 1, 0, 1, 1, 1, 1};
int max=Integer.MIN_VALUE;

for(int i=0;i<arr.length;i++)
{
     int count =1;
    while(i<arr.length-1 && arr[i]==arr[i+1])
    {
        count++;
        i++;
    }
  max=  Math.max(count ,max);
}
System.out.print(max);
 
 
    }
}
