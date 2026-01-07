package CollectionPractice.HashmapsPractice;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagramProblem {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            if(map1.get(s.charAt(i)) == null){
                map1.put(s.charAt(i), 1);
            }
            else{
                map1.put(s.charAt(i), map1.get(s.charAt(i))+1);
            }
        }

        for(int i = 0; i < t.length(); i++){
            if(map2.get(t.charAt(i)) == null){
                map2.put(t.charAt(i), 1);
            }
            else{
                map2.put(t.charAt(i), map2.get(t.charAt(i))+1);
            }
        }

        for(char c : map1.keySet()){
            if(!map1.get(c).equals(map2.get(c))){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        ValidAnagramProblem obj = new ValidAnagramProblem();
        System.out.println(obj.isAnagram(s, t));
    }
}
