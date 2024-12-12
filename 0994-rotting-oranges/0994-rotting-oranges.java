class Solution {
    public int orangesRotting(int[][] grid) {
        
        int noOfFresh = 0;
        int minMinutes = 0;
        Queue<Pair<Integer,Integer>> queue = new LinkedList<Pair<Integer,Integer>>();
        
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j] == 1)
                    noOfFresh+=1;
                else if(grid[i][j] == 2)
                    queue.add(new Pair<>(i,j));
            }
        }
        
        if (noOfFresh == 0) 
            return 0;
        
        
        
        while(! queue.isEmpty())
        {
            boolean freshTurnedRotten = false;
            int level = queue.size();
            for(int i=0;i<level;i++)
            {
                Pair<Integer,Integer> current = queue.poll();
                //logic
                if((current.getKey()+1) < grid.length && grid[current.getKey()+1][current.getValue()] == 1)
                {
                    noOfFresh--;
                    grid[current.getKey()+1][current.getValue()]=2;
                    freshTurnedRotten = true;
                    queue.add(new Pair<>(current.getKey()+1, current.getValue()));
                }
                
                if(current.getKey()-1 >= 0 && grid[current.getKey()-1][current.getValue()] == 1)
                {
                    noOfFresh--;
                    grid[current.getKey()-1][current.getValue()]=2;
                    freshTurnedRotten = true;
                    queue.add(new Pair<>(current.getKey()-1, current.getValue()));
                }
                
                if(current.getValue()+1 < grid[0].length && grid[current.getKey()][current.getValue()+1] == 1)
                {
                    noOfFresh--;
                    grid[current.getKey()][current.getValue()+1]=2;
                    freshTurnedRotten = true;
                    queue.add(new Pair<>(current.getKey(), current.getValue()+1));
                }
                
                if(current.getValue()-1 >= 0 && grid[current.getKey()][current.getValue()-1] == 1)
                {
                    noOfFresh--;
                    grid[current.getKey()][current.getValue()-1]=2;
                    freshTurnedRotten = true;
                    queue.add(new Pair<>(current.getKey(), current.getValue()-1));
                }
                
            }
            if(freshTurnedRotten)
                minMinutes++;
            
        }
        
        return noOfFresh <= 0?  minMinutes : -1;
    }
    
}