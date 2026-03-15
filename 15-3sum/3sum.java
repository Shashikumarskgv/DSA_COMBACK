


import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> r= new ArrayList<>();
        Arrays.sort(nums);
        for(int a= 0;a<nums.length-2;a++){
            int i = a+1;
            int j = nums.length-1;
            while(i<j){
                int sum = nums[a]+nums[i]+nums[j];
            if(sum==0){
                r.add(Arrays.asList(nums[a],nums[i],nums[j]));
                i++;
                j--;
            }else if(sum>0){
                j--;
            }else{
                i++;
            }

            }
            
        }
          Set<List<Integer>> set = new LinkedHashSet<>(r);
        
            List<List<Integer>> result = new ArrayList<>(set);
                
       return result;

    }
}