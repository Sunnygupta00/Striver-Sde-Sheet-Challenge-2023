// brute force : using two queue

class MyStack {
    Queue<Integer>q = new LinkedList<>();

    public MyStack() {
        
    }
    
    public void push(int x) {
        Queue<Integer>temp = new LinkedList<>();
        temp.offer(x);
         // hence we want to make it peek so we have to add it first 
        // and then re-add all element 
        while(q.size()>0){
            temp.offer(q.poll());
        }
        while(temp.size()>0){
            q.offer(temp.poll());
        }
    }
    
    public int pop() {
        return q.poll();
    }
    
    public int top() {
        return q.peek();
    }
    
    public boolean empty() {
        return q.size()==0;
    }
}










====================================================================================================================
//optimised : using one q
class MyStack {
    Queue<Integer>q = new LinkedList<>();

    public MyStack() {
        
    }
    
    public void push(int x) {
        q.offer(x);
        // hence we want to make it peek so we have to add it first 
        // and then readd all element 
        int size = q.size();
        for(int i=0;i<size-1;i++){ 
            q.offer(q.poll());
        }
    }
    
    public int pop() {
        return q.poll();
    }
    
    public int top() {
        return q.peek();
    }
    
    public boolean empty() {
        return q.size()==0;
    }
}
