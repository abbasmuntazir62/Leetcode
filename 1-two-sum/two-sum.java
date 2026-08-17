class Solution {
    public int[] twoSum(int[] nums, int target) {

        // hashmap bana rhe hai
        Map<Integer,Integer>map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
        //compliment store karne kt liye dabba bana rhe hai
        int complement = target - nums[i];

        //dekh rhe hai compliment map me hai kya
        if(map.containsKey(complement)){
            return new int[]{map.get(complement),i};
        }

        //agar nhi hai compliment map me to jo value aaye hai subtract karke jisko compliment bol rge hai usko put kardo hasmap me
        map.put(nums[i],i);

    }
    return new int[]{};
    }
}