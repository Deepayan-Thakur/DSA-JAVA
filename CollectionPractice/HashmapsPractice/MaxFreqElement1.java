package CollectionPractice.HashmapsPractice;

import java.util.*;

public class MaxFreqElement1 {

    public static int maxFreqElement(int[] arr){
        Map<Integer, Integer> map = new HashMap<>();
        int maxCount = 0;
        int key = 0;
        for(int element : arr){
            if(map.get(element) != null){
                map.put(element, map.get(element)+1);
            }
            else{
                map.put(element, 1);
            }
        }

        for(var e : map.entrySet()){
            if(e.getValue() > maxCount){
                key = e.getKey();
                maxCount = e.getValue();
            }
        }
        return key;
    }

    public static void main(String[] args) {
        int[] arr = {1,4,2,5,1,4,4,6,4,4,4};
        System.out.println("The most frequent element is = "+maxFreqElement(arr));
    }
}
