package Arrays.MaxOnes;


//Given a binary array nums, return the maximum number of consecutive 1's in the array.
//Leetcode 485

public class Optimal {
    static int findMaxConsecutiveOnes(int nums[]) {
        int cnt = 0;
        int maxi = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) 
            {
                cnt++;
            } 
            else 
            {
                cnt = 0;
            }

            maxi = Math.max(maxi, cnt);
        }
        return maxi;
    }
    public static void main(String args[]) 
    {
        
        int nums[] = { 1, 1, 0, 1, 1, 1 };
        int ans = findMaxConsecutiveOnes(nums);
        System.out.println("The maximum  consecutive 1's are " + ans);

    }      
}
