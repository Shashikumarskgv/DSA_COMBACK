import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
         Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if(map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
        // int i = 0;
        // int j = nums.length - 1;
        
        // while (i < j) {
        //     int sum = nums[i] + nums[j];

        //     if (sum == target) {
        //         return new int[]{i, j};
        //     } 
        //     else if (sum < target) {
        //         i++;   
        //     } 
        //     else {
        //         j--;   
        //     }
        // }
        // return new int[]{-1, -1};
        // for(int i=0; i<nums.length; i++){
        //     for(int j=i+1;j<nums.length; j++){
        //          if(nums[i]+nums[j]==target){
        //              result[0]=i;
        //              result[1]=j;
        //              return result;

        //          }

        //     }

        // }
        
        // return result;
    }
}