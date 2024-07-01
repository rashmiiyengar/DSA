package Hash;

import java.util.HashMap;

//Given an integer array of size n, find all elements that appear more than n/3 times
// nums[] = { 1,3,2,5,1,3,1,5,1}
//1
//freq > n/3
//nums[] ={1,2}
//1,2 

//HashMap
//Time complexity o(n)
//Steps : 
//1) Create hash map with k,v as int datatype
//2) Find freq of all nums and store in map
//3) Find out the majority element with max freq , traverse on map and check where freq>n/3
//4) map.keySet() returns a set which has all the keys
//5) for(int key: map.keyset()) loops over each key in the keyset

public class FrequencyNby3 {

    public static void maximumFrequency(int nums[]){

        HashMap<Integer,Integer> map = new HashMap();
        int n =  nums.length;
        for(int i=0;i<n;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }else{
                map.put(nums[i], 1);
            }
        }

        for(int key: map.keySet()){
            if(map.get(key) > n/3){
                System.out.println("The element with maximum frequency > n/3 is " +key);
            }
        }

    }
    public static void main(String[] args) {
        
        int nums[] = { 1,3,2,5,1,3,1,5,1};
        maximumFrequency(nums);

    }

}
