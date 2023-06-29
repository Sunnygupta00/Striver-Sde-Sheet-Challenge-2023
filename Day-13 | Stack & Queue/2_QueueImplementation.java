class Queue{
	int size;
	int initialSize = 0;
	int top =0;
	int start = 0;
	int arr[];
	Queue(int x){
		arr = new int[x];
		size = x;
	}
	void offer(int x) {
		if(initialSize !=size) {
			arr[top] = x;
			initialSize++;
			top  = (top+1)%size;
		}else {
			System.out.println("error");
		}
	}
	int poll() {
		if(initialSize == 0) {
			return -1;
		}
		int x = arr[start];
		start++;
		initialSize--;
		return x;
	}
	int peek() {
		return top;
	}
	
}
