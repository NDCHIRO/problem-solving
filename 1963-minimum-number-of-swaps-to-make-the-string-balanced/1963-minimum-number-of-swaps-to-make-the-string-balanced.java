class Solution {
    public int minSwaps(String s) {
        ArrayList<Character> list = new ArrayList<>();
        int count = 0;
        
        for(int i=0;i<s.length();i++)
            if(s.charAt(i) == '[')
                list.add(s.charAt(i));
            else
            {
                if(!list.isEmpty()) 
                    list.remove(list.size()-1);
                else
                    count++;
            }
        return (count+ 1) / 2;
    }
}