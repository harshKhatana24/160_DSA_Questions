//Stock Buy and Sell – Max one Transaction Allowed

//Brute Force Approach
/*
class Solution6{
    public int maxProfit(int prices[]) {
        // code here
        int ans=0;int n=prices.length;
        int temp=0;
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if (temp<(prices[j]-prices[i])) {
                    temp=prices[j]-prices[i];
                }
            }
            if(ans < temp) ans=temp;
            temp=0;
        }
        return ans;
    }
}

*/


//Optimized Approach - use minPrice and maxProfit variables
class Solution6{
    public int maxProfit(int prices[]){
        int ans = 0;
        int n=prices.length;
        if(n==0 || n==1) return 0;
        int min=prices[0];//lowest price we have seen so far
        int maxProfit=0;//maximum price we have seen so far
        for (int i=0;i<n;i++){
            if (min>prices[i]) min=prices[i];
            if (maxProfit<(prices[i]-min)) maxProfit=prices[i]-min;
        }
        ans=maxProfit;
        return ans;
    }
}

public class Day631052026 {
    public static void main(String[] args) {
        int prices[]={7, 10, 1, 3, 6, 9, 2};
        Solution6 solution6=new Solution6();
        int ans=solution6.maxProfit(prices);
        System.out.println(ans);
    }
}
