class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int intCount = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                intCount++;
            }else{
               maxCount = Math.max(maxCount, intCount);
               intCount = 0; 
            }
        }
        return Math.max(maxCount,intCount);
    }
}