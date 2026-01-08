import java.util.*;

public class IsomericStringsProblem {
    public static boolean isomericStrings(String s, String t){
        Map<Character, Character> map = new HashMap<>();
        if(s.length() == t.length()){
            char[] ch = s.toCharArray();
            char[] th = t.toCharArray();
            for(int i = 0; i < ch.length; i++){
                if(map.containsKey(ch[i])){
                    if(!map.get(ch[i]).equals(th[i])){
                        return false;
                    }
                }
                else{
                    if(map.values().contains(th[i])){
                        return false;
                    }
                    map.put(ch[i], th[i]);
                }
            }
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        String s = "aabc";
        String t = "xxyw";
        boolean result = isomericStrings(s,t);
        System.out.println(result);
    }
}
