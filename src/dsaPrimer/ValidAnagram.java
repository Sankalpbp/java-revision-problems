package dsaPrimer;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> sFrequency = new HashMap<>();
        Map<Character, Integer> tFrequency = new HashMap<> ();

        for (char ch : s.toCharArray()) {
            sFrequency.put(ch, sFrequency.getOrDefault(ch, 0) + 1);
        }

        for (char ch : t.toCharArray()) {
            tFrequency.put(ch, tFrequency.getOrDefault(ch, 0) + 1);
        }

        if (sFrequency.size() != tFrequency.size()) {
            return false;
        }

        for (Map.Entry<Character, Integer> entry : sFrequency.entrySet()) {
            if (!tFrequency.containsKey(entry.getKey()) ||
                    !entry.getValue().equals(tFrequency.get(entry.getKey()))) {
                return false;
            }
        }

        return true;
    }

}
