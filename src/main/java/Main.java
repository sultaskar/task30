import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        String word = "askar";
        findUniqueChar(word);
    }




public static void findUniqueChar(String string) {
    char[] stringArray = string.toCharArray();
    Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
    for (char c : stringArray) {
        if (map.get(c) == null) {
            map.put(c, 1);
        } else {
            map.put(c, map.get(c) + 1);
        }
    }
    for (Map.Entry<Character, Integer> entry : map.entrySet()) {
        if (entry.getValue() == 1) {
            System.out.println(entry.getKey());
            break;
        }
    }
}
}