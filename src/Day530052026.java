import java.util.ArrayList;
import java.util.HashMap;

class Solution5 {
    public ArrayList<Integer> findMajority(int[] arr) {
        // Code here
        int n=arr.length;
        ArrayList<Integer> list=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        int val;
        int flag=(int)Math.floor(n/3);
        for (int i=0;i<n;i++){
            val=arr[i];
            if (map.containsKey(val) && map.get(val)<=flag) {
                map.put(val, map.get(val)+1);
                if (map.get(val)>flag && !list.contains(val)) {
                    list.add(val);
                }
                continue;
            }
            map.put(val,1);
        }

        list.sort((a,b)->a-b);

        return list;
    }
}


public class Day530052026 {
    public static void main(String[] args) {
        int arr[]={3,3,3,3,3};
        Solution5 sol=new Solution5();
        ArrayList<Integer> ans=sol.findMajority(arr);
        System.out.println(ans);
    }
}
