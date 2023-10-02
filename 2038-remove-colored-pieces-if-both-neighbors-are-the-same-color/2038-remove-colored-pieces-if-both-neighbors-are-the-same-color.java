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
        if(sb.length()<3){
            boolean res=(player==0)?  false:true;
            return res;
        }
        
        for(int i=1;i<sb.length()-1;i++){
            if(sb.charAt(i)==sb.charAt(i+1) && sb.charAt(i)==sb.charAt(i-1)
              && sb.charAt(i)==((char)('A'+player))){
                sb.deleteCharAt(i);
                player = 1 ^ player;
                done = 1;
            }
        }
        
        if(done!=1){
            boolean res=(player==0)?  false:true;
            return res;
        }
        return checkWinner(sb,player);
    }
}