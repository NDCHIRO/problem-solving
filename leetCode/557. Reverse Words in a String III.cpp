class Solution {
public:
    string reverseWords(string s) 
    {
        int i=0;
        string words="";
        string word="";
        while(i<s.size())
        {
            if(s[i] == ' ')
            {
                reverse(word.begin(),word.end());
                words += word;
                if((i+1)<s.size())
                    words+=" ";
                word="";
            }
            else
                word+=s[i];   
            i++;
        }
    //reverse last word and add it
    reverse(word.begin(),word.end());
    words += word;
    return words;
    }
};
