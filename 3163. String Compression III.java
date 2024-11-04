class Solution {
    public String compressedString(String word) {
        int count=1;
        char ch=word.charAt(0);
        String ans="";
        for(int i=1;i<word.length();i++)
        {
            if(word.charAt(i)!=ch)
            {
                ans+=Integer.toString(count);
                ans+=ch;
                ch=word.charAt(i);
                count=1;
            }
            else
            {
                if(count<9)
                {
                    count++;
                }
                else
                {
                    ans+=Integer.toString(count);
                    ans+=ch;
                    count=1;
                }
            }
        }
        ans+=Integer.toString(count);
        ans+=ch;
        return ans;
    }
}
