import java.util.*;

class Main {
    public static void main(String[] args) {
        
        int arr[] = {3, 4, 2, 7, 3, 9, 10};
        int k = 3;
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
            if(pq.size() > k) {
                pq.poll(); // remove smallest element if size exceeds k
            }
        }
        
        System.out.println(k + "-th largest element is: " + pq.peek());
    }
}
