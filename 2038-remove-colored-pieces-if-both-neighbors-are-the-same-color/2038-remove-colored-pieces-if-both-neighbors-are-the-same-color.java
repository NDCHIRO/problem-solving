class Solution {
    public boolean winnerOfGame(String colors) {
        StringBuilder sb = new StringBuilder();
        int player=0;
        sb.append(colors);
        return checkWinner(sb,player);
    }
    public boolean checkWinner(StringBuilder sb,int player)
    {
        int done=0;
        if(sb.length()<3)
        {
            if(player==0) return false;
            else return true;
        }
        
        for(int i=1;i<sb.length()-1;i++)
        {
            while(i<sb.length()-1 && sb.charAt(i)==sb.charAt(i+1) && sb.charAt(i)==sb.charAt(i-1)
              && sb.charAt(i)==((char)('A'+player)))
            {
                
                sb.deleteCharAt(i);
                player = 1 ^ player;
                done = 1;
                //System.out.println(sb);
            }
        }
        if(done!=1)
            if(player==0) return false;
            else return true;
        return checkWinner(sb,player);
    }
}