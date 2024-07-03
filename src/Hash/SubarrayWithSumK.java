package Hash;

import java.util.HashMap;

//Asked in Microsoft amazon

public class SubarrayWithSumK {
    
    public static void main(String[] args) {
        
        int arr[] = { 10,2,-2,-20,10};
        int k= -10;
        int sum =0;
        int ans =0;
        HashMap<Integer,Integer> map = new HashMap<>(); //<Sum,Freq>

        map.put(0,1); //empty subarray

        for(int j=0;j<arr.length;j++){
            sum += arr[j];

            if(map.containsKey(sum-k)){
                ans += map.get(sum-k);
            }
 
            if(map.containsKey(sum)){
                map.put(sum, map.get(sum)+1);
            }else{

                map.put(sum,1);
            }
        }

        System.out.println(ans);

        


    }
}
