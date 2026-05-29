// lexicographically next greater permutation

import java.util.Arrays;

class Solution3 {
    void nextPermutation(int[] arr) {
        // code here
        int idx=-1;int n= arr.length;
        for(int i=n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                idx=i;
                break;
            }
        }

        if (idx==-1) reverse(arr,0,n-1);

        for (int i=n-1;i>0;i--){
            if(arr[i]>arr[idx]){
                int temp=arr[i];
                arr[i]=arr[idx];
                arr[idx]=temp;
                break;
            }
        }

        reverse(arr,idx+1,n-1);

    }

    void reverse(int []arr,int start,int end){
        int temp;
        while (start<end){
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}

public class Day429052026 {
    public static void main(String[] args) {

        //Find the 1st decreasing element from end
        //if no index found reverse the entire array
        //Find just larger element from end
        //reverse part after index

        int arr[]={2, 4, 1, 7, 5, 0};
        Solution3 solution3=new Solution3();
        solution3.nextPermutation(arr);
        System.out.println(Arrays.toString(arr));

    }
}
