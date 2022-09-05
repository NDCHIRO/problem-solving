class Solution {
public:
    int findJudge(int n, vector<vector<int>>& trust) {
        if(trust.size() == 0 && n==1)
            return 1;
        vector<int> v(n+1,0);
        for(int i=0;i<trust.size();i++)
            v[trust[i][1]]++;
        
        int index=0;
        int max=0;
        for(int i=0;i<v.size();i++)
        {    
            if(max < v[i])
            {
                max = v[i];
                index = i;
            }
        }
        //if not all the people trust the judge so rule no.1 is broken and return -1
        if(v[index] != n-1)
            return -1;
        
        //check if judge trusted anyone so he is not a judge and return -1 (rule no.2 is broken)
        for(int i=0;i<trust.size();i++)
            if(index == trust[i][0])
                return -1;
        
        return index;
        
            
    }
};
