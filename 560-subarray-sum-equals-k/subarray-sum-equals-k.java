
class Solution {
    public int subarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);   // (1)

        int sum = 0;     // (2)
        int count = 0;   // (3)

        for(int num : nums){   // (4)

            sum += num;        // (5)

            if(map.containsKey(sum - k)){   // (6)
                count += map.get(sum - k);  // (7)
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);  // (8)
        }

        return count;   // (9)
    }
}