

class Solution7 {
    //Kedan's Algorithm
    int maxSubarraySum(int[] arr) {
        // Code here
        int max_sum=Integer.MIN_VALUE;
        int temp=0;
        for (int i=0;i<arr.length;i++){
            if (temp<0) temp=0;
            temp+=arr[i];
            if (max_sum<temp && temp!=0) max_sum=temp;
        }

        int z=Integer.MIN_VALUE;
        if (max_sum<=0){
            for (int i=0;i<arr.length;i++){
                if (z<arr[i]) z=arr[i];
            }
            max_sum=z;
        }

        return max_sum;
    }
}

public class Day701062026 {
    public static void main(String[] args) {
        Solution7 solution7=new Solution7();
        int ans=solution7.maxSubarraySum(new int[]{-8 ,-3 ,-25 ,0 ,-9});
        System.out.println(ans);
    }
}
