class Solution {
    public boolean isCircularSentence(String s) {
        int n=s.length();
        char first=s.charAt(0);
        char last=s.charAt(n-1);
        if(first!=last) return false;
        for(int i=1;i<n;i++)
        {
            if(s.charAt(i)==' ' && s.charAt(i-1)!=s.charAt(i+1))
            return false;
        }
        return true;
    }
}
