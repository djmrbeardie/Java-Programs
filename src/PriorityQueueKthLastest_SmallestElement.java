import java.util.Arrays;
import java.util.Collections;
import java.util.*;

public class PriorityQueueKthLastest_SmallestElement {
    public static void main(String[] args) {
        PriorityQueueKthLastest_SmallestElement obj = new PriorityQueueKthLastest_SmallestElement();
        int[] elements = {5,6,7,8,9,1,2,3,4};
        int k = 4;
        System.out.println("Elements: "+ Arrays.toString(elements));
        System.out.println(k+"th Largest Element: "+ obj.KthLargestElement(elements, k));
        System.out.println(k+"th Smallest Element: "+ obj.KthSmallestElement(elements, k));
    }

    public int KthLargestElement(int[] elements, int k){
        if(k == 0 || elements.length == 0 || k > elements.length)
            return -1;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0; i< elements.length; i++){
            pq.add(elements[i]);
            if(pq.size()>k) pq.poll();
        }

        int result = pq.peek();
        return result;
    }
    public int KthSmallestElement(int[] elements, int k){
        if(k < 1 || elements.length == 0 || k > elements.length)
            return -1;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0; i< elements.length; i++){
            pq.add(elements[i]);
            if(pq.size()>k) pq.poll();
        }

        int result = pq.peek();
        return result;
    }
}
