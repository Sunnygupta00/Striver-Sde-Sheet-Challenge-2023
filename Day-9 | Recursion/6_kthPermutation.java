// brute force generate all permutaion and then then simply return kth index
class Solution {
    public String getPermutation(int n, int k) {
        List<String> per = new ArrayList<>();
        char arr[] = new char[n];
        for(int i=0;i<n;i++){
            arr[i] = (char)('1'+i);
        }
        compute(arr, 0, per);
        Collections.sort(per);
        return per.get(k-1);
    }
    public void compute(char arr[], int index, List<String>per){
        if(arr.length == index){
            per.add(new String(arr));
            return;
        }
        for(int i=index;i<arr.length;i++){
            swap(arr, index, i);
            compute(arr, index+1, per);
            swap(arr, index, i);
        }
    }
    public void swap(char arr[], int i, int j){
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
// optimal: using basic calculation

class Solution {
    public String getPermutation(int n, int k) {
        StringBuilder sb = new StringBuilder();
        List<Character>arr = new ArrayList<>();
        int fact = 1;
        k-=1;
        for(int i=1;i<n;i++){
            fact*=i;
          arr.add((char)(i+'0'));
        }
        arr.add((char)(n+'0'));
        while(true){
            int index = k/fact; // it will tell us the group
            sb.append(arr.get(index));
            arr.remove(index);
            if(arr.size()==0)break;
            k = k%fact; // remaning combination
            fact= fact/arr.size();
        }
        return sb.toString();
    }
}
