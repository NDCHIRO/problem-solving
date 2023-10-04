class MyHashMap {
    
    List<Node> nodes=new ArrayList<Node>();
    public MyHashMap() {
        
    }
    
    public void put(int key, int value) {
        if(idx(key)==-1)
        {
            Node node = new Node(key,value);
            nodes.add(node);
        }
        else
            for(int i=0;i<nodes.size();i++)
                if(nodes.get(i).key==key)
                    nodes.get(i).val=value;
    }
    
    public int get(int key) {
        int val = idx(key);
        return val==-1? -1: val;
    }
    
    public void remove(int key) {
        for(int i=0;i<nodes.size();i++)
            if(nodes.get(i).key==key)
                nodes.remove(i);
    }
    
    int idx(int key){
        for(int i=0;i<nodes.size();i++)
            if(nodes.get(i).key==key)
                return nodes.get(i).val;
        return -1;
    }
}

class Node
{
    int key;
    int val;
    Node(int key,int val)
    {
        this.key=key;
        this.val=val;
    }
}
/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */