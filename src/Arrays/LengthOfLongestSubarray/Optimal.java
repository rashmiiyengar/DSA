package Arrays.LengthOfLongestSubarray;

public class Optimal {

    public static int longestSubarray(int arr[], long k) {
        int left = 0, right = 0, sum = 0, maxLen = 0;

        while (right < arr.length) {

            sum += arr[right];
            // if sum > k , reduce the subarray from left
            // until sum becomes less or equal to k
            while (sum > k && left < right) {
                sum = sum - arr[left];
                left++;
            }

            // if sum==k , update the maxLen i.e answer
            if (sum == k)
                maxLen = Math.max(maxLen, right - left + 1);

            // Move forward to right pointer
            right++;
            // if (right< n)
        }
        return maxLen;
    }

    public static void main(String[] args) {

        int arr[] = { 10, 5, 2, 7, 1, 9 };
        int maxlength= longestSubarray(arr, 15);
        System.out.println("length of longest sub array is : " +maxlength);
    }
}
