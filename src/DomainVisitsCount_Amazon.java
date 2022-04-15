import java.util.*;

public class DomainVisitsCount_Amazon {
    public static void main(String[] args) {
        DomainVisitsCount_Amazon object = new DomainVisitsCount_Amazon();
        String[] domainVisitList = {"500 www.amazon.com","20 hello.amazon.com","34 facebook.com", "54 com","67 facebook."};
        List<String> result = object.domainVisitsCount(domainVisitList);
        object.show(result);
    }

    public List<String>  domainVisitsCount(String[] domainVisits){
        Map<String, Integer> map = new HashMap<>();
        for(String domainVisit : domainVisits){
            String[] fullDomain = domainVisit.split(" ");
            int visitCount = Integer.parseInt(fullDomain[0]);
            int n = 0;
            String[] subDomain = fullDomain[1].split("\\.");
            for(int i=subDomain.length-1; i>=0; i--){
                String key ="";
                for(int j=0; j<=i; j++){
                    key = key + subDomain[j+n];
                    if(j != i){
                        key = key + ".";
                    }
                }
                map.put(key,map.getOrDefault(key,0)+visitCount);
                n++;
            }
        }

        System.out.println(map);

        List<String> result = new ArrayList<>();
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            result.add(entry.getKey()+ "->"+entry.getValue());
        }
        Collections.sort(result);
        return result;
    }
    public void show(List<String> result){
        System.out.println(result);
    }
}
