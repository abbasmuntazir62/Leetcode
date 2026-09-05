// class Solution {
//     public int missingNumber(int[] nums) {
//         int allXOR = 0;
//         //iterate all the element fron range 0 to n
//         for(int i = 0; i < nums.length;i++){
//             allXOR = allXOR^i;
//         }
//         //iterate existing element 
//         for(int num : nums){
//             allXOR = allXOR^num;
//         }
    
//     return allXOR;
// }
// }
class Solution {
    public int missingNumber(int[] nums) {
        int allXOR = 0;

        // 0 to n
        for (int i = 0; i <= nums.length; i++) {
            allXOR = allXOR ^ i;
        }

        // Existing elements
        for (int num : nums) {
            allXOR = allXOR ^ num;
        }

        return allXOR;
    }
}