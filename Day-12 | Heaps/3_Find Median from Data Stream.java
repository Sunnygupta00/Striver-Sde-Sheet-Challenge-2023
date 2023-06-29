class MedianFinder {
    PriorityQueue<Integer>left = new PriorityQueue<>((a,b)->b-a); // max heap
    PriorityQueue<Integer>right = new PriorityQueue<>();// min heap

    public MedianFinder() {
        
    }
    
    public void addNum(int num) {
        if(right.size()<left.size()){
            right.offer(num);
        }else{
            left.offer(num);
        }
        if(right.size()>0 && left.peek()>right.peek()){
            int temp = left.poll();
            left.offer(right.poll());
            right.offer(temp);
        }
    }
    
    public double findMedian() {
       int n = left.size()+right.size();
       if(n%2 == 0){
           return (left.peek()+right.peek())/2.0;
       }else{
           return (double)left.peek();
       }
        
    }
}
