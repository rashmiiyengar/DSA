package Hash;

import java.util.HashMap;

//optimal
public class FreqOfHLOptimal {

    static void Frequency(int arr[], int n) {
        HashMap<Integer, Integer> map = new HashMap();

        for (int i = 0; i < arr.length; i++) {
            // if(map.containsKey(arr[i])){
            // map.put(arr[i], map.get(arr[i])+1);
            // }
            // else{
            // map.put(arr[i],1);
            // }

            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
    }

    public static void main(String[] args) {

        int arr[] = { 10, 5, 10, 15, 10, 5 };
        int n = arr.length;
        Frequency(arr, n);
        int count =1,maxFreq=0,maxElement=0,minFreq=0,minElement=0;

     
    }
}