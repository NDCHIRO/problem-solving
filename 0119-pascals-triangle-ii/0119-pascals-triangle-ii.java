class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        List<Integer> arrList = new ArrayList<Integer>();
        arrList.add(1);
        list.add(arrList);
        for(int i=1;i<=rowIndex;i++){
            arrList = new ArrayList<Integer>();
            arrList.add(1);
            for(int j=1;j<list.get(i-1).size();j++)
            {
                arrList.add(list.get(i-1).get(j-1)+list.get(i-1).get(j));
            }
            arrList.add(1);
            list.add(arrList);
            //System.out.println(list.get(i-1));
        }
        return list.get(rowIndex);
    }
}