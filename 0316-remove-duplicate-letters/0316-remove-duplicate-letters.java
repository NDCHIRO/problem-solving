class Solution {
    public String removeDuplicateLetters(String sr) {

    int[] res = new int[26]; //will contain number of occurences of character (i+'a')
    boolean[] visited = new boolean[26]; //will contain if character (i+'a') is present in current result Stack
    char[] ch = sr.toCharArray();
    for(char c: ch){  //count number of occurences of character 
        res[c-'a']++;
    }
    Stack<Character> st = new Stack<>(); // answer stack
    int index;
    for(char s:ch){ 
        index= s-'a';
        res[index]--;   //decrement number of characters remaining in the string to be analysed
        if(visited[index]) //if character is already present in stack, dont bother
            continue;
        //if current character is smaller than last character in stack which occurs later in the string again
        //it can be removed and  added later e.g stack = bc remaining string abc then a can pop b and then c
        while(!st.isEmpty() && s<st.peek() && res[st.peek()-'a']!=0){ 
            visited[st.pop()-'a']=false;
        }
        st.push(s); //add current character and mark it as visited
        visited[index]=true;
    }

    StringBuilder sb = new StringBuilder();
    //pop character from stack and build answer string from back
    while(!st.isEmpty()){
        sb.insert(0,st.pop());
    }
    return sb.toString();
    }
    /*public String removeDuplicateLetters(String s) {
        Stack<Character> stack = new Stack<>();
        boolean[] visited = new boolean[26];
        int[] freq = new int[26];
        
        for(int i=0;i<s.length();i++)
            freq[s.charAt(i)-'a']++;
        
        for(int i=0;i<s.length();i++)
        {
            if(visited[s.charAt(i)-'a']!=true
              &&freq[s.charAt(i)-'a']>0)
            {
                visited[i]=true;
                stack.push(s.charAt(i));
                freq[s.charAt(i)-'a']--;
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty())
            sb.append((char) (stack.pop() + 'a'));
        return sb.reverse().toString();
    }*/
}