// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class Main {
    public static void main(String[] args) {
     int  arr[] = {1, 2, 3, 4, 5, 6};
     int d = 2;
     //  Output: {3, 4, 5, 6, 1, 2}
     
     reverse(arr,0,arr.length-1);
      printarr(arr);
     reverse(arr,0,arr.length-1-d);
     reverse(arr,arr.length-1-d+1,arr.length-1);
     System.out.println();
      printarr(arr);


     
     
    }
    
    public static void reverse(int arr[],int start,int end)
    {
        while(start<end)
        {
           int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        
        }
    }
    public static void printarr(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+ " ");
        }
    }
}
