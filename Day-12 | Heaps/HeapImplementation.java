// INSERTION 
 // TIME COMPLEXITY  OF INSERT : O(LOG N)
	public void insert(int x) {
		if (size == cap) {
			return;
		}
		size++;
		arr[size - 1] = x;// inserting at last
		// now comparing node with its parent node
		for (int i = size - 1; i != 0 && arr[parent(i)] > arr[i]; i = parent(i)) {
			swap(arr, i, parent(i));

		}

	}
// DELETION
publiic int delete(int arr[]){
  int x = arr[0];
  swap(arr, 0, size--);
  heapify(arr, 0, size);
  return x;
  
}







// HEAPSORT

// NOTE : IF WE WANT TO CHANGE THE ORDER , CHANGE IT IN MINHEAP AND MAX HEAP
public class HEAP_05_HEAPSORT {
  static void buildHeap(int arr[],int size) {
	  int n= (size-2)/2;
	  while(n>=0) {
		  minheapify(arr, n--,size);
//		  maxHeapify(arr, n--, size);
	  }
  }
//  === HEAP SORT===
  public static void heapSort(int arr[],int size) {
	  buildHeap(arr,size);
	  for(int i=size;i>0;i--) {
		  int temp = arr[0];
          arr[0] = arr[i];
          arr[i] = temp;
          minheapify(arr, 0, i);
        /* or
          arr[i]=popMin(arr,i);
         */
	  }
  }
  static int popMin(int arr[],int size) {
	  if(size==0) {
		  return -1;
	  }
	  int top=arr[0];
	  arr[0]=arr[size];
	  minheapify(arr, 0, size);
//	  maxHeapify(arr, 0, size);
	  return top;
  }
     
	public static void main(String[] args) {
		 int[] A = { 6, 4, 7, 1, 9, -2 };
		 heapSort(A,5);
		 for(int a:A)System.out.print(a+" ");
	}
	static int parent(int n) { return (n-1)/2;} 
	static void swap(int arr[],int a,int b) { int temp=arr[a];arr[a]=arr[b]; arr[b]=temp;}	
	public static int left(int i) { return 2*i+1;}
	public static int right(int i) {return 2*i+2;}
	public static void minheapify(int arr[],int i,int size) {//TIME O(LOGN)
		int left=left(i);
		int right=right(i);
		int smaller=i;
		if(left<size && arr[left]<arr[i]) {
			smaller=left;
		}
		if(right<size && arr[right]<arr[smaller]) {
			smaller=right;
		}
		if(smaller!=i) {
			int temp=arr[i];
			arr[i]=arr[smaller];
			arr[smaller]=temp;
			minheapify(arr, smaller,size);
		}
	}
	public static void maxHeapify(int arr[],int i,int size) {//TIME O(LOGN)
		int left=left(i);
		int right=right(i);
		int smaller=i;
		if(left<size && arr[left]>arr[i]) {
			smaller=left;
		}
		if(right<size && arr[right]>arr[smaller]) {
			smaller=right;
		}
		if(smaller!=i) {
			int temp=arr[i];
			arr[i]=arr[smaller];
			arr[smaller]=temp;
			minheapify(arr, smaller,size);
		}
	}

}
