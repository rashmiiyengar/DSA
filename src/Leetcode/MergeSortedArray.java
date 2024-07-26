package Leetcode;

public class MergeSortedArray {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        
        if(n == 0)return;

        int len1 = nums1.length;
        int end_idx = len1-1;
        while(n > 0 && m > 0){
            if(nums2[n-1] >= nums1[m-1]){
                nums1[end_idx] = nums2[n-1];
                n--;
            }else{
                nums1[end_idx] = nums1[m-1];
                m--;
            }
            end_idx--;
        }
        while (n > 0) {
            nums1[end_idx] = nums2[n-1];
            n--;
            end_idx--;
        } 

    }

    public static void main(String[] args) {
        
        int nums1[]={1,2,3,0,0,0};
        int nums2[]={2,5,6};

        merge(nums1, 3, nums2, 3);

        for(int i=0;i<nums1.length;i++){

            System.out.print(nums1[i] );
        }
        

    }
}
