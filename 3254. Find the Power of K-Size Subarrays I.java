class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int n=nums.length;
        int ans[]=new int[n-k+1];
        if(k==1) return nums;
        for(int i=0;i<n-k+1;i++)
        {
            int flag=nums[i];
            for(int j=i+1;j<i+k;j++)
            {
                if(nums[j]==flag+1) flag=nums[j];
                else {
                    flag=-1;
                    break;
                }
            }
            ans[i]=flag;
        }
        return ans;
    }
}
