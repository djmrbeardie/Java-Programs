import java.util.*;

public class PriorityQueueKFrequentWords {
    public static void main(String[] args) {
        String[] words = {"love","leetcode","i","love","coding","i","love","love"};
        int k= 2;
        PriorityQueueKFrequentWords obj = new PriorityQueueKFrequentWords();
        System.out.println(obj.topKFrequent(words,k));
    }
    public List<String> topKFrequent(String[] words, int k){

        Map<String, Integer> map = new HashMap<>();
        for(String word : words){
            map.put(word, map.getOrDefault(word,0)+1);
        }

        /////////// This also works fine. Below code is Lambda representation of below code.
//        PriorityQueue<String> pq = new PriorityQueue<>(new Comparator<String>() {
//            @Override
//            public int compare(String word1, String word2) {
//                int frequency1 = map.get(word1);
//                int frequency2 = map.get(word2);
//                if(frequency1 == frequency2) return word2.compareTo(word1);
//                return frequency1 - frequency2;
//            }
//        });

        PriorityQueue<String> pq = new PriorityQueue<>((word1, word2) -> {
            int frequency1 = map.get(word1);
            int frequency2 = map.get(word2);
            if(frequency1 == frequency2) return word2.compareTo(word1);
            return frequency1 - frequency2;
        });


        for(Map.Entry<String, Integer> entry : map.entrySet()){
            pq.add(entry.getKey());
            if(pq.size() > k) pq.poll();
        }

        List<String> result = new ArrayList<>();
        while(!pq.isEmpty()) result.add(pq.poll());

        Collections.sort(result);

        return result;
    }

}
