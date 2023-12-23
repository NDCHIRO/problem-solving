class Solution {
    public boolean isPathCrossing(String path) {
        HashSet<String> set = new HashSet<>();
        int x=0;
        int y=0;
        set.add(x+"-"+y);
        for(char c:path.toCharArray())
        {
            switch(c)
            {
                case 'N':
                    y+=1;
                    break;
                case 'S':
                    y-=1;
                    break;
                case 'E':
                    x-=1;
                    break;
                case 'W':
                    x+=1;
                    break;
            }
            String s = x+"-"+y;
            if(set.contains(s))
                return true;
            set.add(s);
        }
        return false;
    }
}