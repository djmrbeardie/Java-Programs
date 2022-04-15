import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.*;

public class PriorityQueueKLargest_SmallestNumbers {
    public static void main(String[] args) {
        PriorityQueueKLargest_SmallestNumbers obj = new PriorityQueueKLargest_SmallestNumbers();
        int[] elements = {1,2,3,4,5};
        int k=3;

        System.out.println("Numbers: "+ Arrays.toString(elements));
        System.out.println(k+" Largest Numbers: "+ obj.kLargestNumbers(elements, k));
        System.out.println(k+"th Smallest Numbers: "+ obj.kSmallestNumbers(elements, k));
    }

    public List<Integer> kLargestNumbers(int[] numbers, int k){

        if(k < 1 || k > numbers.length || numbers.length == 0)
            return new ArrayList<>(Arrays.asList(-1));
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0; i<numbers.length; i++){
            pq.add(numbers[i]);
            if(pq.size() > k) pq.poll();
        }

        List<Integer> result = new ArrayList<>();
        while(!pq.isEmpty()) result.add(pq.poll());
        return result;

    }
    public List<Integer> kSmallestNumbers(int[] numbers, int k){

        if(k < 1 || k > numbers.length || numbers.length == 0)
            return new ArrayList<>(Arrays.asList(-1));
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i=0; i<numbers.length; i++){
            pq.add(numbers[i]);
            if(pq.size() > k) pq.poll();
        }

        List<Integer> result = new ArrayList<>();
        while(!pq.isEmpty()) result.add(pq.poll());
        Collections.sort(result);
        return result;

    }
}
