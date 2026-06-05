import java.util.ArrayList;
import java.util.Arrays;

class Solution11 {
    public int getMinDiff(int[] arr, int k) {
        // code here
        int n=arr.length;
        int ans=arr[n-1]-arr[0];
        Arrays.sort(arr);
        int max=0,min=0;
        int sumK=arr[0]+k,remK=arr[0]-k;

        for (int i=0;i<n;i++){
            max=Math.max(sumK,arr[i]+k);
            min=Math.min(remK,arr[i]-k);


            StringBuilder sb=new StringBuilder();
            sb.toString();

            if (min<0) continue;
            ans=Math.max(ans,max-min);
        }

        return ans;
    }
}


public class Day1104062026 {
    public static void main(String[] args) {
        //Minimize the Heights ||
        //Given an array arr[] denoting heights of n towers and a positive integer k.

        Solution11 sol=new Solution11();
        int ans=sol.getMinDiff(new int[]{1, 8, 10, 6, 4, 6, 9, 1}, 7);
        System.out.println(ans);
    }
}
