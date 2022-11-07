class Solution {
    public List<String> cellsInRange(String s) {
        List<String> result = new ArrayList<String>();
        int num1 = Integer.parseInt(s.charAt(1)+"");
        int num2 = Integer.parseInt(s.charAt(4)+"");
        System.out.println(num1);
        char start = s.charAt(0);
        char end = s.charAt(3);
        while(start <= end && num1 <= num2)
        {
            result.add(start+""+num1);
            num1+=1;
            if(num1>num2)
            {
                num1=Integer.parseInt(s.charAt(1)+"");;
                start+=1;
            }
        }
        return result;
    }
}