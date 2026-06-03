import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


class Solution9 {



    //Optimal Approach
    public int maxCircularSum(int arr[]) {
        // code here

        int totalSum=0;
        int currMax=0;int maxSum=arr[0];
        int currMin=0;int minSum=arr[0];

        for (int num:arr){
            totalSum+=num;

            currMax=Math.max(num,num+currMax);
            maxSum=Math.max(maxSum,currMax);

            currMin=Math.min(num,num+currMin);
            minSum=Math.min(minSum,currMin);
        }

        if (maxSum<0) return maxSum;

        return Math.max(maxSum,totalSum-minSum);
    }



}



class Solution10 {
    public int missingNumber(int[] arr) {
        // code here
//        Arrays.sort(arr, );

        List<Integer> list=Arrays.stream(arr)
                                    .boxed() //once i boxed it IntStream becomes a Stream<Integer>
                                    .sorted((a,b)->a-b)
                                    .toList();

        System.out.println(list);

        int flag=1;
        for (int num:list){
            if (num<flag)
                continue;
            if (num>flag) {
                return flag;
            }
            flag+=1;

        }

        return flag;

    }
}



public class Day903062026 {

    public static void main(String[] args) {
//        Solution9 solution9=new Solution9();
//        int ans=solution9.maxCircularSum(new int[]{10, -3, -4, 7, 6, 5, -4, -1});
//        System.out.println(ans);


        Solution10 solution=new Solution10();
        int ans=solution.missingNumber(new int[]{5, 3, 2, 5, 1});
        System.out.println(ans);
    }
}
