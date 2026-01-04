package CollectionPractice.HashmapsPractice;

import java.util.HashMap;
import java.util.Map;

public class MaxFreqSollution {
    public static void main(String[] args) {
        int[] arr = {1,4,2,5,1,4,4,6,4,4,4};
        Map<Integer, Integer> map = new HashMap<>();
        for(var e : arr){
            if(!map.containsKey(e)){
                map.put(e, 1);
            }
            else{
                map.put(e, map.get(e)+1);
            }
        }

        System.out.println("Frequency Map");
        System.out.println(map.entrySet());
        int maxFreq = 0, ansKey = -1;
        
    }
}
