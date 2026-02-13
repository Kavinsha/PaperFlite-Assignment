import java.util.*;
public class Problem1{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Given a non-empty array of integers nums, every element appears twice except for one.Find that single one.");
        System.out.println();
        System.out.println("Enter the length of array:");
        int n=sc.nextInt();
        if(n%2==0){
            System.out.println("Invalid array");
            return;
        }
        int[] nums=new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        Solution obj= new Solution();
        int result=obj.singleNumber(nums);
        System.out.println("The non repeating element in the given array is: "+result);
    }
}
class Solution{
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i+=2){
            if(nums[i]!=nums[i+1]){
                return nums[i];
            }
        }
        return nums[nums.length-1];
        
    }
}
