class Solution {
public:
    int findJudge(int n, vector<vector<int>>& trust) {
        if(trust.size() == 0 && n!=1)
            return -1;
        vector<int> in(n+1,0);
        vector<int> out(n+1,0);
        
        for(auto node:trust)
        {
            in[node[0]]++;
            out[node[1]]++;
        }
        
        for(int i=1;i<=n;i++)
        {
            if(in[i]==0 && out[i]==n-1)
                return i;
        }
        return -1;   
    }
};
