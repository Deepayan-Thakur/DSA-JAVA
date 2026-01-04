package CollectionPractice.HashmapsPractice;

import java.sql.SQLOutput;
import java.util.*;

public class MaxFreqElement {

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
        int[] arr = {2,2,1,3,4,2};
        System.out.println("The most frequent element is = "+maxFreqElement(arr));
    }
}
