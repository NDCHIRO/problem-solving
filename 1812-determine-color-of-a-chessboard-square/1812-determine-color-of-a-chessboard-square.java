class Solution {
    public boolean squareIsWhite(String coordinates) {
        char c = coordinates.charAt(0);
        int flag=-1;
        if(c=='b' || c=='d' || c=='f' || c=='h')
            flag = 1;
        else 
            flag = 0;
        
        if((flag==1 && (Integer.parseInt(coordinates.charAt(1)+"") % 2) != 0)
           || (flag==0 && (Integer.parseInt(coordinates.charAt(1)+"") % 2) == 0) )
            return true;
        else 
            return false;
    }
}