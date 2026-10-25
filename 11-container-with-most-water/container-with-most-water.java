class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int maxstorage = Integer.MIN_VALUE;

        while(left<right){
            int smallwall = Math.min(height[left],height[right]);
            int storage = smallwall * (right-left);
            maxstorage = Math.max(storage,maxstorage);

            if(height[left]<height[right]){
                left++;

            }
            else{
                right--;
            }
        }
        
    return maxstorage;
        
    }
}