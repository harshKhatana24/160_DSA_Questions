class Solution8 {





    int maxProduct(int[] arr) {

        int maxEndingHere=arr[0];
        int minEndingHere=arr[0];
        int ans=arr[0];
        for (int i=1;i< arr.length;i++){
            if (arr[i]<0){
                int temp=maxEndingHere;
                maxEndingHere=minEndingHere;
                minEndingHere=temp;
            }

            maxEndingHere=Math.max(arr[i], maxEndingHere*arr[i]);
            minEndingHere=Math.min(arr[i], minEndingHere*arr[i]);

            ans=Math.max(ans,maxEndingHere);
        }

        return ans;
    }












    //when we can consider the full array and element from anywhere
    /*
    int maxProduct(int[] arr) {

        int maxEndingHere = arr[0];
        int minEndingHere = arr[0];
        int ans = arr[0];

        for (int i=0;i<arr.length;i++){
            int prevMax = maxEndingHere;
            int prevMin = minEndingHere;

            maxEndingHere=Math.max(arr[i], Math.max(arr[i]*prevMax, arr[i]*prevMin));
            minEndingHere=Math.min(arr[i], Math.min(arr[i]*prevMax, arr[i]*prevMin));

            ans=Math.max(ans,maxEndingHere);
        }

        return ans;
    }

     */
}

public class Day802062026 {
    public static void main(String[] args) {
        Solution8 solution8=new Solution8();
        int max=solution8.maxProduct(new int[]{-2, 6, -3, -10, 0, 2});
        System.out.println(max);
    }

}
