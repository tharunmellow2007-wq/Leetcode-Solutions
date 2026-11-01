class Solution {
    public int minMoves(int[] nums) {
        int sum=0;int min=nums[0];
        int n=nums.length;
        for(int num:nums){
            sum+=num;
            if(num<min){
                min=num;
            }
        }
        return sum-min*n; 
    }
}