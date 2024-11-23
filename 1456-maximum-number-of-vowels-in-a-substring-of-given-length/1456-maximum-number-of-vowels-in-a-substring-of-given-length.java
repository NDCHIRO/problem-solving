class Solution {
    public int maxVowels(String s, int k) {
        String vowels = "aeiou";
        int localSum = 0;
        for(int i=0;i<k;i++)
        {
            if(vowels.contains(s.charAt(i)+""))
                localSum++;
        }
        
        int maxSum = localSum;
        
        for(int i=k;i<s.length();i++)
        {
            if(vowels.contains(s.charAt(i)+""))
                localSum++;
            if(vowels.contains(s.charAt(i-k)+""))
                localSum--;
            maxSum = Math.max(localSum,maxSum);
        }
        
        return maxSum;
    }
}