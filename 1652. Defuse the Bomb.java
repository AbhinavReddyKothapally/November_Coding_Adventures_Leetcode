class Solution {
    public int[] decrypt(int[] code, int k) {
        int n=code.length;
        int[] ans=new int[n];
        if(k==0) return ans;
        else if(k<0){
        for(int i=0;i<n;i++)
        {
            int j=i-1;
            int val=-k;
            while(val-->0)
            {
                ans[i]+=code[(j+n)%n];
                j--;
            }
        }}
        else
        {
            for(int i=0;i<n;i++)
            {
                int j=i+1;
                int val=k;
                while(val-->0)
                {
                    ans[i]+=code[j%n];
                    j++;
                }
            }
        }
        return ans;
    }
}
