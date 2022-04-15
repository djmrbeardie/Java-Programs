import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class PriorityQueueKFrequentNumbers {
    public static void main(String[] args) {
        PriorityQueueKFrequentNumbers obj = new PriorityQueueKFrequentNumbers();
        int[] numbers = {1,2,2,4,5,2,7,8,8,9,9,9};
        int k = 3;
        System.out.println(obj.kFrequentNumbers(numbers, k));
    }

    public List<Integer> kFrequentNumbers(int[] numbers, int k){

        Map<Integer, Integer> map = new HashMap<>();
        for(int number : numbers){
            map.put(number, map.getOrDefault(number,0)+1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>(){
            public int compare(Integer num1, Integer num2){
                int frequency1 = map.get(num1);
                int frequency2 = map.get(num2);
                if(frequency1 == frequency2) return num1.compareTo(num2);
                return frequency1-frequency2;
            }
        });

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            pq.add(entry.getKey());
            if(pq.size() > k) pq.poll();
        }

        List<Integer> result = new ArrayList<>();
        while(!pq.isEmpty()) result.add(pq.poll());
        Collections.sort(result);
        return result;
    }
}
