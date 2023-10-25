class Solution {
    public int kthGrammar(int n, int k) {
        if(n==1)
            return 0;
        int parent = kthGrammar(n-1,(k/2)+(k%2));
        boolean isKOdd = (k%2!=0)? true:false;
        if(parent == 1)
        {
            if(isKOdd==true)
                return 1;
            else
                return 0;
        }
        else
            if(isKOdd==true)
                return 0;
            else
                return 1;
        /*String s="0";
        List<String> list = new ArrayList<String>();
        list.add(s);

        for(int i=1;i<n;i++)
        {
            s="";
            String index = list.get(list.size()-1);
            for(char c : index.toCharArray())
            {
                if(c=='0')
                    s+="01";
                else if(c=='1')
                    s+="10"; 
            }
            //System.out.println(s);
            list.add(s);
        }

        
        char ch = ((list.get(list.size()-1)).charAt(k-1));
        //System.out.println(ch);
        return Integer.parseInt(ch+"");*/
    }
}