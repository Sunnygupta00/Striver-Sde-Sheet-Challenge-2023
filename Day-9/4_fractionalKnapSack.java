
    double fractionalKnapsack(int W, Item arr[], int n) 
    {
        // sorting using b*x - a*y 
        Arrays.sort(arr, (a,b)-> (b.value*a.weight)-(a.value*b.weight));
        double profit = 0;
        for(int i=0;i<n;i++){
            if(arr[i].weight <= W){
                profit+= arr[i].value;
                // System.out.println(arr[i].value);
                W-= arr[i].weight;
            }else{
                double v = W*arr[i].value;
                profit+= v/arr[i].weight;
                //   System.out.println(W+" "+arr[i].weight+" "+arr[i].value);
                W-=W;
                break;
            }
        }
        return profit;
    }
