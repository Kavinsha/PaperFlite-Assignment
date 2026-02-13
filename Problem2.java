import java.util.*;
public class Problem2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Given string num representing a non-negative integer num, and an integer k, return the smallest possible integer after removing k digits from num.");
        System.out.println();
        System.out.println("Enter the number:");
        String n=sc.next();
        System.out.println("Enter k value:");
        int k=sc.nextInt();
        Solution2 obj=new Solution2();
        String result=obj.removeKdigits(n,k);
        System.out.println(result);
    }
    
}
class Solution2{
    public String removeKdigits(String num,int k){
        Stack<Character> st=new Stack<>();
        for(int i=0;i<num.length();i++){
            char ch=num.charAt(i);
            while(!st.isEmpty() && k>0 && st.peek()>ch){
                st.pop();
                k--;
            }
            st.push(ch);
        }
        while(k>0){
            st.pop();
            k--;
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<st.size();i++){
            char ch=st.get(i);
            sb.append(ch);
        }
        while(sb.length()>1 && sb.charAt(0)=='0'){
            sb.deleteCharAt(0);
        }
        if(sb.length()==0){
            return "0";
        } 
        else{
            return sb.toString();
        }

}
};