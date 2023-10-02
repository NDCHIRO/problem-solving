class Solution {
    public boolean winnerOfGame(String colors) {
        StringBuilder sb = new StringBuilder();
        //alice -> player=0 , bob -> player=1
        int player=0;
        sb.append(colors);
        return checkWinner(sb,player);
    }
    public boolean checkWinner(StringBuilder sb,int player)
    {
        //charRemoved is used to check if the player removed a char (charRemoved = true) 
        //or he didn't remove any char (charRemoved = false) so that means he lost the game
        boolean charRemoved=false;
        if(sb.length()<3){
            return (player==0)?  false:true;
        }
        
        for(int i=1;i<sb.length()-1;i++){
            //check if the current char = prev char = next char = the current player turn  
            if(sb.charAt(i)==sb.charAt(i+1) && sb.charAt(i)==sb.charAt(i-1)
              && sb.charAt(i)== ((char)('A'+player)) ){
                sb.deleteCharAt(i);
                //change the player's turn between 0 and 1 depends on the current player turn
                //alice -> player=0 , bob -> player=1
                player = 1 ^ player;
                charRemoved = true;
            }
        }
        if(charRemoved!=true){
            return (player==0)?  false:true;
        }
        return checkWinner(sb,player);
    }
}