class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        Set<Integer>[] graph = new HashSet[n];
        boolean[] visited = new boolean[n];
        for(int i=0;i<n;i++)
        {
            graph[i] = new HashSet<>();
        }
        for(int [] edge : edges)
        {
            int a = edge[0],b=edge[1];
            graph[a].add(b);
            graph[b].add(a);
        }
        
        visited[source] = true;
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(source);
        while(!queue.isEmpty())
        {
            if(queue.contains(destination))
                return true;
            int cur = queue.poll();
            for(int next : graph[cur])
            {
                if(!visited[next])
                {
                    visited[next]=true;
                    queue.add(next);
                }
            }
        }
        return false;
    }
}