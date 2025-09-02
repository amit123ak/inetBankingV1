// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class Main {
    public static void main(String[] args) {
// Move All Zeroes To End
int arr[] = {1, 14, 2, 16, 10, 20};
// find the third largest element from the distinct element ;
int fmax= Integer.MIN_VALUE;
int smax=Integer.MIN_VALUE;
int tmax= Integer.MIN_VALUE;
for(int i=0;i<arr.length;i++)
{
     if(arr[i]>fmax)
     {
         tmax=smax;

         smax=fmax;
         
         fmax=arr[i];
     }else if(arr[i]>smax)
     {
         tmax=smax;
         smax=arr[i];
     }else if(arr[i]>tmax)
     {
         tmax=arr[i];
     }
    
}
System.out.println("first max =  "+ fmax);
System.out.println("second max =  "+ smax);
System.out.println("third max =  "+ tmax);


 
    }
}
