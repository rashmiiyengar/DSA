package Leetcode;

public class RunningSums1480 {
    public static int[] runningSum(int[] nums) {
        
        for(int i=1;i<nums.length;i++){
                nums[i] = nums[i-1]+nums[i];
        }
        return nums;
    }

    public static void main(String[] args) {
        int nums[]={1,2,3,4};

        int[] res=runningSum(nums);

        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+ " ");
        }

    }
}
