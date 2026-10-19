package dsaPrimer;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacter {

    public int firstUniqChar(String s) {

        Map<Character, Integer> mappings = new HashMap<>();
        for (char ch : s.toCharArray()) {
            mappings.put(ch, mappings.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < s.length(); ++i) {
            if (mappings.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
    }

}
