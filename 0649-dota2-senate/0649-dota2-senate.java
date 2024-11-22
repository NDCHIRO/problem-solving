class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer> qR = new LinkedList<>();
        Queue<Integer> qD = new LinkedList<>();
        
        for(int i=0;i<senate.length();i++)
        {
            if(senate.charAt(i)=='R')
                qR.add(i);
            else
                qD.add(i);
        }
        
        while(!qR.isEmpty() && !qD.isEmpty())
        {
            int indexR = qR.poll();
            int indexD = qD.poll();
            
            if(indexR<indexD)
            {
                qR.add(indexR+senate.length());
            }
            else
                qD.add(indexD+senate.length());
        }
        
        return qR.isEmpty()? "Dire":"Radiant";
        
    }
}