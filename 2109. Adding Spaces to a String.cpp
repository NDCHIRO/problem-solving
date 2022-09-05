class Solution {
public:
    string addSpaces(string s, vector<int>& spaces) {
        string res ="";
        for(int i=0,j=0;i<s.size();i++)
        {
            if(j < spaces.size() && i == spaces[j])
            {
                res+=" ";
                j++;
            }
            res+=s[i];
        }
        return res;
    }
};
