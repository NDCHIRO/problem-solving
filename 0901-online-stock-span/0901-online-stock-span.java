class StockSpanner {
    ArrayList<Integer> stock;
    int maxSpan;
    public StockSpanner() {
        stock = new ArrayList<Integer>();

    }
    
    public int next(int price) {
        maxSpan = 0;
        stock.add(price);
        int i=stock.size()-1;
        while(i>=0  && stock.get(i)<=stock.get(stock.size()-1) )
        {
            maxSpan+=1;
            i--;
        }
        return maxSpan;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */