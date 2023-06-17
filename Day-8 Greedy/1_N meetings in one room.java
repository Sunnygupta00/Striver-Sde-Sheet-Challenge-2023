// time  :  O(nlogn)
// space : O(2*n)

class Solution 
{
    public static int maxMeetings(int start[], int end[], int n)
    {
        int [][] arr = new int[n][];
        for(int i = 0;i<n;i++){
           arr[i] =  new int[]{start[i], end[i]};
        }
        // sorting wrt end time
        Arrays.sort(arr, (a,b)->Integer.compare(a[1],b[1]));
        int meet = 1;
        int shedule[] = arr[0];
        for(int i=1;i<n;i++){
            // comparing with previous sheduled meeting
            if(shedule[1]<arr[i][0]){
                shedule = arr[i];
                meet++;
            }
        }
        return meet;
    }
    
}
