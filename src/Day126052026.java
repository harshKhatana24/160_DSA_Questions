/*
* Given an array of positive integers arr[],
* return the second largest element from the array.
* If the second largest element doesn't exist then return -1.

Note: The second largest element should not be
* equal to the largest element.
*
* */





public class Day126052026 {
    public static void main(String[] args) {
        int[] arr={10, 10, 10};
        Solution obj=new Solution();
        int ans=obj.getSecondLargest(arr);
        System.out.println("Second Largest Element: "+ans);
    }
}


class Solution {
    int getSecondLargest(int[] arr) {
        int ans=-1;
        int temp=-1;

        for(int i=0;i<arr.length;i++){
            if (arr[i]>temp || arr[i]>ans){
                if (temp < arr[i]){
                    ans=temp;
                    temp=arr[i];
                } else if (ans<arr[i] && arr[i]!=temp) {
                    ans=arr[i];
                }

            }
        }

        return ans;
    }
};
