class Solution {
    public int minMoves(int[] nums) {
        int sum=0;int min=Integer.MAX_VALUE;
        int n=nums.length;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            if(nums[i]<min){
                min=nums[i];
            }
        }
        return sum-min*n; 
    }
}