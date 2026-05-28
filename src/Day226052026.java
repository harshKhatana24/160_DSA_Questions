import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;




/*

//with the help of the data structure

class Solution1 {
    int[] pushZerosToEnd(int[] arr) {

        ArrayList<Integer> al=new ArrayList<>();
        int temp;
        int flag=0;
        for (int i=0;i<arr.length;i++){
            temp=arr[i];
            if(temp==0){
                al.addLast(0);
            }else{
                al.add(flag,temp);
                flag++;
            }
        }

        for(int i=0;i<arr.length;i++) arr[i]=al.get(i);

        return arr;
    }
}

 */






//using two pointer approach
/*
* [1, 2, 0, 4, 3, 0, 5, 0] ptr1->1,ptr2->1
* [1, 2, 0, 4, 3, 0, 5, 0] ptr1->2,ptr2->2
* [1, 2, 0, 4, 3, 0, 5, 0] ptr1->0,ptr2->0
* [1, 2, 0, 4, 3, 0, 5, 0] ptr1->0,ptr2->4  {swap}
* [1, 2, 4, 0, 3, 0, 5, 0] ptr1->0,ptr2->0
* [1, 2, 4, 0, 3, 0, 5, 0] ptr1->0,ptr2->0
* [1, 2, 4, 0, 3, 0, 5, 0] ptr1->0,ptr2->3  {swap}
* [1, 2, 4, 3, 0, 0, 5, 0] ptr1->0,ptr2->0
* [1, 2, 4, 3, 0, 0, 5, 0] ptr1->0,ptr2->0
* [1, 2, 4, 3, 0, 0, 5, 0] ptr1->0,ptr2->5  {swap}
* [1, 2, 4, 3, 5, 0, 0, 0] ptr1->0,ptr2->0
*/
class Solution1 {
    int[] pushZerosToEnd(int[] arr) {

        int ptr1=0;int ptr2=0;int temp;
        int n=arr.length;
        while (ptr2<n){
            if (arr[ptr1]==0&&arr[ptr2]!=0){
                arr[ptr1]=arr[ptr2];
                arr[ptr2]=0;
                ptr1++;
            } else if (arr[ptr1]!=0) {
                ptr1++;
            }

            ptr2++;
        }

        return arr;
    }
}





public class Day226052026 {
    public static void main(String[] args) {
        int arr[]={1, 2, 0, 4, 3, 0, 5, 0};
        Solution1 sol=new Solution1();
        int arr1[]=sol.pushZerosToEnd(arr);
        System.out.println(Arrays.toString(arr));
    }
}
