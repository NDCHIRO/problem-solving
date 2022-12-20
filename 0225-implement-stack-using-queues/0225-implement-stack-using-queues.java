class MyStack {
    Queue<Integer> q;
    Queue<Integer> q2;
    public MyStack() {
        q = new LinkedList<>();
        q2 = new LinkedList<>();
    }
    
    public void push(int x) {
        int size = q.size();
        q2.clear();
        q2.add(x);
        for(int i=0;i<size;i++)
        {
            q2.add(q.remove());
         }
        for(int i=0;i<size+1;i++)
        {
            q.add(q2.remove());
         }

    }
    
    public int pop() {
        return q.remove();
    }
    
    public int top() {
        return q.peek();
    }
    
    public boolean empty() {
        return q.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */