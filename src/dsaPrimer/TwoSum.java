package dsaPrimer;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSum(int [] nums, int target) {
        Map<Integer, Integer> mappings = new HashMap<>();
        int [] result = new int [2];

        for (int i = 0; i < nums.length; ++i) {
            if (mappings.containsKey(target - nums[i])) {
                result[0] = i;
                result[1] = mappings.get(target - nums[i]);
                return result;
            } else {
                mappings.put(nums[i], i);
            }
        }

        return result;
    }

}
