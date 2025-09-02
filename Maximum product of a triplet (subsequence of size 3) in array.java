// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class Main {
    public static void main(String[] args) {
// Move All Zeroes To End
int   arr[ ] = {10, 3, 5, 6, 20};
//find maxium triplate 
Arrays.sort(arr);
int n= arr.length;
int triple = Math.max(arr[0]*arr[n-1]*arr[n-2],arr[n-1]*arr[n-2]*arr[n-3]);
System.out.println(triple);



 
    }
}
