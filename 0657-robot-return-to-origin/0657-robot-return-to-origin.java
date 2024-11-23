class Solution {
    public boolean judgeCircle(String moves) {
        int x = 0;
        int y=0;
        for(char c : moves.toCharArray())
        {
            if(c=='L') x++;
            if(c=='R') x--;
            if(c=='U') y++;
            if(c=='D') y--;
        }
        if(x == 0 && y==0)
            return true;
        return false;
    }
}