import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

class Solution12 {




public int myAtoi(String s) {
    // code here
    int i=0;
    int n=s.length();

    if (n<=0) return 0;


    int sign=1;
    int ans=0;
    //white space and sign
    while(i<n){
        char ch=s.charAt(i);

        if (ch==' '){
            i++;
            continue;
        }
        else if (ch=='-'){
            sign=-1;
            i++;
        }
        else if (ch=='+') {
            i++;
            continue;
        }
        else break;

    }


    //leading zero handle
    while (i<n){
        char ch=s.charAt(i);
        if (ch=='0') {
            i++;
            continue;
        }
        else {
            break;
        }

    }

    ans=helper(s,i,sign);

    return ans;
}


int helper(String s, int i, int sign){

    StringBuilder sb=new StringBuilder();

    while(i<s.length()){
        char ch=s.charAt(i);
        if (ch>='0' && ch<='9'){
            sb.append(ch);
            i++;
        }
        else{
            break;
        }

    }


    if (sb.isEmpty()) return 0;

    long ans=Long.parseLong(sb.toString());
    ans = ans * sign;

    if (ans>Integer.MAX_VALUE){
        return Integer.MAX_VALUE;
    }
    else if (ans<Integer.MIN_VALUE){
        return Integer.MIN_VALUE;
    }
    return (int) ans;
}





    /*public String addBinary(String s1, String s2) {
        // code here

        int n1=s1.length()-1;
        int n2=s2.length()-1;

        if (n1==-1 || n2==-1){
            return n1==-1?s1:s2;
        }


        StringBuilder sb=new StringBuilder();
        int carry=0;
        while(n1>=0 || n2>=0 || carry==1){

            int sum=carry;

            if (n1>=0 && s1.charAt(n1)=='1') sum+=1;
            if (n2>=0 && s2.charAt(n2)=='1') sum+=1;

            sb.append(sum%2);
            carry=sum/2;

            n1--;
            n2--;

            System.out.println(sb + " " + carry);
        }

        sb.reverse();
        while (sb.charAt(0)=='0'){
            sb.deleteCharAt(0);
        }

        return sb.toString();
    }*/




    /*public boolean areAnagrams(String s1, String s2) {
        // code here

        HashMap<Character,Integer> map1=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();

        for (int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            if (map1.containsKey(ch)){
                map1.put(ch,map1.get(ch)+1);
            }else{
                map1.put(ch,1);
            }
        }

        for (int i=0;i<s2.length();i++){
            char ch=s2.charAt(i);

            if (!map1.containsKey(ch)){
                return false;
            }

            if (map2.containsKey(ch)){
                map2.put(ch,map2.get(ch)+1);
            }else{
                map2.put(ch,1);
            }
        }


        return map1.equals(map2);
    }




     */





    /*public char nonRepeatingChar(String s) {
        // code here

        HashMap<Character,Boolean> map=new HashMap<>();

        for (int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if (map.containsKey(ch)){
                map.put(ch,true);
            }else{
                map.put(ch,false);
            }

        }

        for (int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if (!map.get(ch)) return ch;
        }

        return '$';
    }*/





    /*ArrayList<Integer> search(String pat, String txt) {
        // code here
        ArrayList<Integer> al=new ArrayList<>();

        int n1=pat.length();
        int n2=txt.length();

        if (n1>n2) return al;

        //aabaacaadaabaaba

        for (int i=0;i<=n2-n1;i++){
            if (txt.substring(i,i+n1).equals(pat)){
                al.add(i);
            }
        }

        return al;
    }*/







}










public class Day1204062027 {
    public static void main(String[] args) {
        Solution12 sol=new Solution12();
        int ans=sol.myAtoi(" -00012312312=31311133");
        System.out.println(ans);


//        System.out.println(sol.areAnagrams("geeks","kseeg"));


//        char ch=sol.nonRepeatingChar("geeksforgeeks");
//        System.out.println(ch);


//        System.out.println(sol.search("aaba","aabaacaadaabaaba"));

    }
}
