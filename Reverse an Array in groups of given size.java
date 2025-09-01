// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
//Reverse an Array in groups of given size

class Main {
    public static void main(String[] args) {
     int  arr[] = {1, 2, 3, 4, 5, 6};
     
  int k=5 ;
  
  for(int i=0;i<arr.length;i=i+k)
  {
    int  start=i;
  int  end=  Math.min(i+k-1,arr.length-1);
  reverse(arr,start,end);
   printarr(arr);
   System.out.println();
  }
  // printarr(arr);
     
     
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
