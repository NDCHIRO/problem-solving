class Solution {
    public boolean checkIfPangram(String sentence) {
        char[] c = sentence.toCharArray();
        Arrays.sort(c);
        int j=0;
        if((c[0]-97)!=j)
            return false;
        j++;
        for(int i=1;i<c.length;i++)
        {
            if(c[i]==c[i-1])
                continue;
            else if((c[i]-97) == j || ((c[i]-97) == j-1))
                j++;
            else if((c[i]-97) != j || ((c[i]-97) != j-1))
                return false;
        }
        if(j==26)
            return true;
        return false;
    }
}