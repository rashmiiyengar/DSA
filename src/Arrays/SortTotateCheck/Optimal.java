package Arrays.SortTotateCheck;

//1752. Check if Array Is Sorted and Rotated
//Given an array nums, return true if the array was originally sorted in 
//non-decreasing order, then rotated some number of positions (including zero). Otherwise, return false.

public class Optimal {
    
    public static boolean check(int[] nums) {

        int n = nums.length;
        int count = 0;

        if(n==1){
            return true;
        }
        
        for(int i = 0; i < n-1; i++ ){ 
            if(nums[i] > nums[i+1]){  
                count++;
            }
        }

        if(nums[0] < nums[n-1]){
            count++;
        }
        return count <=1 ;
    }

    public static void main(String[] args) {
        
        int nums[]={2,1,3,4};
        boolean result=check(nums);
        System.out.println(result);

    }
}
