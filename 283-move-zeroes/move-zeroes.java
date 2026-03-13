class Solution {
    public void moveZeroes(int[] nums) {
        
        int pos = 0;
        int i = 0;
        while(i<nums.length){
            if(nums[i]!=0){
                nums[pos]=nums[i];
                pos++;
            }
            i++;
        }
        while(pos<nums.length){
            nums[pos]=0;
            pos++;
        }
        System.out.println(nums);
    }
}