import java.lang.reflect.Array;
import java.util.Arrays;

public class Day327052026 {
    public static void main(String[] args) {
        int[] arr1={2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
//        Solution2 obj=new Solution2();
//        obj.reverseArray(arr1);
//        System.out.println(Arrays.toString(arr1));





    Solution2 obj=new Solution2();
    obj.rotateArray(arr1,3);
        System.out.println(Arrays.toString(arr1));




    }
}










/*


//Reverse the Array
//Note: Modify the array in place.


class Solution2 {
    public void reverseArray(int arr[]) {
        // code here
        int n=arr.length;
        int ptr1=0;
        int ptr2=n-1;
        int temp;
        for (int i=0;i<n/2;i++){
            temp=arr[ptr1];
            arr[ptr1]=arr[ptr2];
            arr[ptr2]=temp;
            ptr1++;
            ptr2--;
        }
    }
}


 */



class Solution2{
    public void rotateArray(int[] arr,int d){

        int n=arr.length;
        /*
        * For Right Rotation by k steps:
            Reverse the entire array
            Reverse the first k elements
            Reverse the remaining n - k elements

        For Left Rotation by k steps:
            Reverse the first k elements
            Reverse the remaining n - k elements
            Reverse the entire array
        * */
        d = d%n;

        //reverse the first k elements
        reverseArray(arr,0,d-1);
        //reverse the rest
        reverseArray(arr,d,n-1);
        //reverse the entire array
        reverseArray(arr,0,n-1);

    }

    private void reverseArray(int[] arr, int start, int end) {
        int temp;
        while(start<end){
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}