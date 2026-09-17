class Solution {
    public int findDuplicate(int[] nums) {
        
        int i = nums[0],j = nums[0];
        do { 
            i = nums[i];
            j = nums[nums[j]];
        } while (i != j);  
         i = nums[0];
        while (i != j) {
            i = nums[i];
            j = nums[j];
        }
    
//   int k=nums[0];
//     for(int i= 0; i<nums.length-1; i++){
//         for(int j = i+1; j<nums.length;j++){
//             if(nums[i]==nums[j]){
//                  k= nums[i];
//             }
//         }
//     }


    
       
        return i;
    }
}