class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int t=nums.length-1;t>i;t--){
                int result=nums[t]+nums[i];
                if(result==target){
                    int[] temp =new int[]{i,t};
                    return temp;
                }
            }
        }
        return new int[0];
    }
}
