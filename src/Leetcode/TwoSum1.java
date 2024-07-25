package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum1 {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        int n = nums.length;

        // Build the hash table
        for (int i = 0; i < n; i++) {
            numMap.put(nums[i], i);
        }

        // Find the complement
        for (int i = 0; i < n; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement) && numMap.get(complement) != i) {
                return new int[]{i, numMap.get(complement)};
            }
        }

        return new int[]{}; // No solution found 
    }

    public static void main(String[] args) {
        
        int nums[]={2,7,11,15};

        int res[] =twoSum(nums, 9);

        for(int i=0;i<res.length;i++){
            System.out.print(res[i]);
        }
    }

}
