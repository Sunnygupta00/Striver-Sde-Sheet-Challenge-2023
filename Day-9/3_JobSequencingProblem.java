// time : O(nlogn)
// space: O(n)
class Solution
{
    
    int[] JobScheduling(Job arr[], int n)
    {
        Arrays.sort(arr, (a,b)-> b.profit- a.profit);
        int maxDeadline = 0;
        for(Job i : arr){
            maxDeadline = Math.max(i.deadline, maxDeadline);
        }
        int job[] = new int[maxDeadline+1];
        int profit = 0;
        int count = 0;
        for(Job i : arr){
            // we are just checking that i can that job before deadline or not
            for(int j = i.deadline;j>0;j--){
                if(job[j] == 0){
                    profit+= i.profit;
                    job[j] = i.profit;
                    count++;
                    break;
                }
            }
        }
        return new int[]{count, profit};
    }
}
