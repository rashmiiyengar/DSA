package Hash;

import java.util.HashSet;
// Union {7,3,9,6,2,4}
// Nested loop - Time complexity will be o(n^2)
// Sort o(nlogn)
// Optimal using hashmap

public class UnionOfTwoArrays {
    
    public static int union(int arr1[], int arr2[]){
        HashSet<Integer> set = new HashSet<>();

        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int j=0;j<arr2.length;j++){
            set.add(arr2[j]);
        }
        return set.size();
    }

    public static void main(String[] args) {
        
        int arr1[] = {7,3,9};
        int arr2[] = {6,3,9,2,9,4};

        int setSize =union(arr1, arr2);
        System.out.println("Number of elements in union set is : " +setSize);

    }
}
